package com.github.ivan.kopylove;

import com.github.ivan.kopylove.telegram.api.client.TelegramClient;
import com.github.ivan.kopylove.telegram.api.domain.GetMe;
import com.github.ivan.kopylove.telegram.api.domain.GetUpdate;
import com.github.ivan.kopylove.telegram.api.domain.Message;
import com.github.ivan.kopylove.telegram.api.domain.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

import static com.github.ivan.kopylove.Constant.CHOOSE_RELEVANT;
import static com.github.ivan.kopylove.Constant.VIN;
import static java.lang.System.currentTimeMillis;
import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.TimeUnit.SECONDS;

@Service
public class BotStarter
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BotStarter.class);

    private final TelegramClient telegramClient;
    private final CommandHandler commandHandler;
    private final CommandMapper  commandMapper;

    public BotStarter(TelegramClient telegramClient, CommandHandler commandHandler, CommandMapper commandMapper)
    {
        this.telegramClient = telegramClient;
        this.commandHandler = commandHandler;
        this.commandMapper = commandMapper;
    }

    public void start() throws URISyntaxException, IOException, InterruptedException
    {
        GetMe me = telegramClient.getMe();

        LOGGER.info("me {}", me);

        ScheduledExecutorService ses = newScheduledThreadPool(1);

        ses.scheduleAtFixedRate(() -> {
            try
            {
                GetUpdate getUpdate = telegramClient.getUpdate();

                for (Update update : getUpdate.getResult())
                {
                    long start = currentTimeMillis();

                    LOGGER.info("update {}", update);
                    Message message = update.getMessage();
                    if (message != null)
                    {
                        List<String> handle = commandHandler.handle(commandMapper.mapCommand(message.getText()));
                        for (String s : handle)
                        {
                            telegramClient.sendSingleMessage(s,
                                                             message.getChat()
                                                                    .getId());
                        }

                        telegramClient.sendSingleButton(message.getChat()
                                                               .getId(), CHOOSE_RELEVANT, VIN, "button_callback");
                    }

                    LOGGER.info("Processed update in {} ms.", currentTimeMillis() - start);
                }
            }
            catch (Throwable e)
            {
                LOGGER.error("", e);
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException ex)
                {
                    LOGGER.error("InterruptedException", ex);
                    throw new RuntimeException(ex);
                }
            }
        }, 0, 5, SECONDS);
    }
}
