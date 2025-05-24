package com.github.ivan.kopylove.commons.client.yandex.api.speech;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.stream.Collectors;

import static com.github.ivan.kopylove.commons.client.yandex.api.speech.Voices.alena;
import static com.github.ivan.kopylove.commons.client.yandex.api.speech.Voices.ermil;
import static com.github.ivan.kopylove.commons.client.yandex.api.speech.Voices.jane;
import static com.github.ivan.kopylove.commons.client.yandex.api.speech.Voices.john;
import static com.github.ivan.kopylove.commons.client.yandex.api.speech.Voices.madirus;
import static com.github.ivan.kopylove.commons.client.yandex.api.speech.Voices.philip;
import static com.github.ivan.kopylove.commons.client.yandex.api.speech.Voices.zahar;
import static java.net.http.HttpClient.newHttpClient;
import static java.nio.charset.StandardCharsets.UTF_8;

public final class YandexSpeechSynthesisAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(YandexSpeechSynthesisAPI.class);
    private static final String YANDEX_TTS_API_URL = "https://tts.api.cloud.yandex.net/speech/v1/tts:synthesize";
    /**
     * The limit from Yandex API side.
     */
    private static final int YANDEX_API_TEXT_LIMIT = 4999;
    private final YandexApiParameters apiParameters;
    private final HttpClient httpClient = newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public YandexSpeechSynthesisAPI(YandexApiParameters apiParameters) {

        this.apiParameters = apiParameters;
    }

    private static String urlEncode(Map<?, ?> map) {
        return map.entrySet()
                .stream()
                .map(entry -> entry.getValue() == null ? urlEncode(entry.getKey()) : urlEncode(entry.getKey()) + "=" + urlEncode(
                        entry.getValue()))
                .collect(Collectors.joining("&"));
    }

    private static String urlEncode(Object obj) {
        return URLEncoder.encode(obj.toString(), UTF_8);
    }

    /**
     * The IAM token lifetime doesn't exceed 12 hours, but we recommend requesting the token more often, like once per hour.
     */
    public byte[] yandexSpeechGenerate(String text, Voice voice) {
        try {
            if (text.length() > YANDEX_API_TEXT_LIMIT) {
                throw new RuntimeException();
            }


            Map<String, String> voiceParam = switch (voice) {
                case JOHN -> john();
                case ERMIL -> ermil();
                case PHILIP -> philip();
                case ALENA -> alena();
                case MADIRUS -> madirus();
                case JANE -> jane();
                case ZAHAR -> zahar();
//                case OMAZH -> omazh();
                default -> throw new RuntimeException("unhandled voice");
            };

            voiceParam.put("text", text);
            voiceParam.put("folderId", apiParameters.folderId());

            String url = YANDEX_TTS_API_URL + "?";
            url += urlEncode(voiceParam);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization", "Bearer " + apiParameters.token())
                    .POST(HttpRequest.BodyPublishers.noBody())
                    .build();

            for (int i = 0; i < 6; i++) {

                HttpResponse<byte[]> response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());

                if (response.statusCode() != 200) {
                    LOGGER.error("Error calling yandex API: status {} {} {}",
                            response.statusCode(),
                            response,
                            voiceParam);
                    throw new RuntimeException(response.toString());
                }

                return response.body();
            }
            throw new RuntimeException("failed to load using several attempts" + request);
        } catch (RuntimeException | IOException | InterruptedException e) {
            LOGGER.error("Error calling yandex API", e);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }

        }

        throw  new RuntimeException("unexpected");

    }
}
