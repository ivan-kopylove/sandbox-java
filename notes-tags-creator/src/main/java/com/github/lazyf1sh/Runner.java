package com.github.lazyf1sh;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.ivan.kopylove.commons.util.Pair;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static com.github.ivan.kopylove.commons.stream.StreamUtil.iteratorToStream;
import static java.nio.file.Files.writeString;

public final class Runner {
    public static final ObjectMapper YAML_MAPPER = new ObjectMapper(new YAMLFactory());
    private static final String VISIBILITY = "visibility";
    private static final String FISH_TAG = ".obsidian-fish-tag.url";
    private static final String FISH_ALIAS = ".obsidian-fish-alias.url";
    private static final int MAX_SYSTEM_LENGTH = 255;
    private static final String MARKDOWN_EXTENSION = ".md";
    private static String OBS_RUNNER = ".obsidian-fish-runner.url";


    private Runner() {
    }

    public static void main(String[] args) throws IOException {
        List<Pair<Path, JsonNode>> collect = Files.walk(Path.of("d:\\1\\notes\\payload\\")).filter(path -> path.toString().endsWith(MARKDOWN_EXTENSION)).filter(path -> !path.toString().contains("_tesseract_")).filter(Files::isRegularFile)
                //                .limit(20)
                .map(s -> new Pair<>(s, readNode(s))).toList();
        collect.forEach(frontmatterYaml -> createFiles(frontmatterYaml.key(), frontmatterYaml.value()));
    }

    private static void createFiles(Path path, JsonNode fullYamlNode) {
        if (fullYamlNode == null) {
            return;
        }

        Path directory = path.getParent();
        validateDirectory(directory);

        createIdUrl(path);
        createAliasesUrls(path, fullYamlNode);
        createIndividualTags(directory, fullYamlNode);
        createJoinedTag(directory, fullYamlNode);
    }

    private static void createAliasesUrls(Path path, JsonNode tags) {
        Path directory = path.getParent();
        JsonNode aliases = tags.get("aliases");
        if (aliases == null) {
            return;
        }

        iteratorToStream(aliases.elements()).map(JsonNode::asText).forEach(alias -> {
            try {
                Path urlPath = Path.of(directory.toString(), alias);
                Path truncated = truncatePath(urlPath, FISH_ALIAS);
                if (Files.notExists(truncated)) {
                    writeString(truncated, buildInternetShortcutBody(getFileNameWithoutExtension(path)));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });
    }

    private static void createIdUrl(Path path) {
        Path directory = path.getParent();

        try {
            Path urlPath = Path.of(directory.toString(), getFileNameWithoutExtension(path) + OBS_RUNNER);
            if (Files.notExists(urlPath)) {
                writeString(urlPath, buildSearchQuery(getFileNameWithoutExtension(path)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static String getFileNameWithoutExtension(Path path) {
        String[] split = path.getFileName().toString().split("\\.");


        return Arrays.stream(split).limit(split.length - 1).collect(Collectors.joining("."));
    }

    @NotNull
    private static String buildInternetShortcutBody(String id) {
        return """
                [{000214A0-0000-0000-C000-000000000046}]
                Prop3=19,0
                [InternetShortcut]
                IDList=
                URL=obsidian://open/?vault=notes&file=""" + id + """
                                       
                HotKey=0
                """;
    }

    @NotNull
    private static String buildSearchQuery(String query) {
        return """
                [{000214A0-0000-0000-C000-000000000046}]
                Prop3=19,0
                [InternetShortcut]
                IDList=
                URL=obsidian://search/?vault=notes&query=""" + query + """ 
                 -tesseract
                                       
                HotKey=0
                """;
    }


    private static void createIndividualTags(Path directory, JsonNode frontMatterYaml) {
        JsonNode tagsYamlNode = frontMatterYaml.get("tags");
        if (tagsYamlNode == null) {
            return;
        }

        iteratorToStream(tagsYamlNode.elements()).map(JsonNode::asText).forEach(tag -> {
            try {
                Path path = Path.of(directory.toString(), tag);
                Path truncated = truncatePath(path, FISH_TAG);
                if (Files.notExists(truncated)) {
                    writeString(truncated, buildSearchQuery(tag));

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });
    }

    private static void createJoinedTag(Path directory, JsonNode tags) {
        JsonNode tagsNode = tags.get("tags");
        if (tagsNode == null) {
            return;
        }

        NavigableSet<String> sortedTags = new TreeSet<>();
        tagsNode.elements().forEachRemaining(s -> sortedTags.add(s.asText()));

        try {
            String joinedTags = sortedTags.stream().filter(v -> !v.contains(VISIBILITY)).collect(Collectors.joining(";"));
            if (joinedTags.isBlank()) {
                return;
            }

            Path joinedPath = Path.of(directory.toString(), joinedTags);
            Path truncatePath = truncatePath(joinedPath, FISH_TAG);

            if (Files.notExists(truncatePath)) {
                Files.createFile(truncatePath);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @NotNull
    private static Path truncatePath(Path path, String extension) {
        int maxLength = MAX_SYSTEM_LENGTH - extension.length();

        if (path.toString().length() > maxLength) {
            String truncated = path.toString().substring(0, maxLength);
            return Path.of(truncated + extension);
        } else {
            return Path.of(path + extension);
        }
    }

    private static void validateDirectory(Path directory) {
        if (!Files.isDirectory(directory)) {
            throw new RuntimeException("is not directory: " + directory);
        }
    }

    private static JsonNode readNode(Path path) {
        try {
            return YAML_MAPPER.readTree(path.toFile());
        } catch (Exception e) {
            return YAML_MAPPER.createObjectNode();
        }
    }
}
