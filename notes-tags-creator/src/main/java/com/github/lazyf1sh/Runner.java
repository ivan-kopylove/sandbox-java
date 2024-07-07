package com.github.lazyf1sh;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.ivan.kopylove.commons.util.Pair;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static com.github.ivan.kopylove.commons.stream.StreamUtil.iteratorToStream;

public final class Runner
{
    public static final  ObjectMapper YAML_MAPPER        = new ObjectMapper(new YAMLFactory());
    private static final String       VISIBILITY         = "visibility";
    private static final String       FISH_TAG           = ".fish-tag";
    private static final String       FISH_ALIAS         = ".fish-alias";
    private static final int          MAX_SYSTEM_LENGTH  = 255;
    private static final String       MARKDOWN_EXTENSION = ".md";

    private Runner()
    {
    }

    public static void main(String[] args) throws IOException
    {
        List<Pair<Path, JsonNode>> collect = Files.walk(Path.of("d:\\1\\notes\\notes-payload\\"))
                                                  .filter(path -> path.toString()
                                                                      .endsWith(MARKDOWN_EXTENSION))
                                                  .filter(Files::isRegularFile)
                                                  //                .limit(20)
                                                  .map(s -> new Pair<>(s, readNode(s)))
                                                  .toList();
        collect.forEach(frontmatterYaml -> {
            Path directory = frontmatterYaml.key()
                                            .getParent();
            validateDirectory(directory);
            createFiles(directory, frontmatterYaml.value());
        });
    }

    private static void createFiles(Path directory, JsonNode fullYamlNode)
    {
        if (fullYamlNode == null)
        {
            return;
        }

        createAliases(directory, fullYamlNode);
        createIndividualTags(directory, fullYamlNode);
        createJoinedTag(directory, fullYamlNode);
    }

    private static void createAliases(Path directory, JsonNode tags)
    {
        JsonNode aliases = tags.get("aliases");
        if (aliases == null)
        {
            return;
        }

        iteratorToStream(aliases.elements()).map(JsonNode::asText)
                                            .forEach(alias -> {
                                                try
                                                {
                                                    Path path = Path.of(directory.toString(), alias);
                                                    Path truncated = truncatePath(path, FISH_ALIAS);
                                                    if (Files.notExists(truncated))
                                                    {
                                                        Files.createFile(truncated);
                                                    }
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println(e);
                                                }
                                            });
    }

    private static void createIndividualTags(Path directory, JsonNode frontMatterYaml)
    {
        JsonNode tagsYamlNode = frontMatterYaml.get("frontMatterYaml");
        if (tagsYamlNode == null)
        {
            return;
        }

        iteratorToStream(tagsYamlNode.elements()).map(JsonNode::asText)
                                                 .forEach(tag -> {
                                                     try
                                                     {
                                                         Path path = Path.of(directory.toString(), tag + FISH_TAG);
                                                         Path truncated = truncatePath(path, FISH_TAG);
                                                         if (Files.notExists(truncated))
                                                         {
                                                             Files.createFile(truncated);
                                                         }
                                                     }
                                                     catch (Exception e)
                                                     {
                                                         System.out.println(e);
                                                     }
                                                 });
    }

    private static void createJoinedTag(Path directory, JsonNode tags)
    {
        JsonNode tagsNode = tags.get("tags");
        if (tagsNode == null)
        {
            return;
        }

        NavigableSet<String> sortedTags = new TreeSet<>();
        tagsNode.elements()
                .forEachRemaining(s -> sortedTags.add(s.asText()));

        try
        {
            String joinedTags = sortedTags.stream()
                                          .filter(v -> !v.contains(VISIBILITY))
                                          .collect(Collectors.joining(";"));
            if (joinedTags.isBlank())
            {
                return;
            }

            Path joinedPath = Path.of(directory.toString(), joinedTags);
            Path truncatePath = truncatePath(joinedPath, FISH_TAG);

            if (Files.notExists(truncatePath))
            {
                Files.createFile(truncatePath);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @NotNull
    private static Path truncatePath(Path path, String extension)
    {
        int maxLength = MAX_SYSTEM_LENGTH - extension.length();

        if (path.toString()
                .length() > maxLength)
        {
            String truncated = path.toString()
                                   .substring(0, maxLength);
            return Path.of(truncated + extension);
        }
        else
        {
            return Path.of(path + extension);
        }
    }

    private static void validateDirectory(Path directory)
    {
        if (!Files.isDirectory(directory))
        {
            throw new RuntimeException("is not directory: " + directory);
        }
    }

    private static JsonNode readNode(Path path)
    {
        try
        {
            return YAML_MAPPER.readTree(path.toFile());
        }
        catch (Exception e)
        {
            return YAML_MAPPER.createObjectNode();
        }
    }
}
