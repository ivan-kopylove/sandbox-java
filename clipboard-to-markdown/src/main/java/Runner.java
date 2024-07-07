import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.cli.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;
import static com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature.*;

public final class Runner {
    public static final ObjectMapper YAML_MAPPER;
    public static CommandLine PARSED_COMMAND_LINE;

    static {
        YAMLFactory yamlFactory = new YAMLFactory();
        yamlFactory.enable(MINIMIZE_QUOTES);
        yamlFactory.enable(INDENT_ARRAYS_WITH_INDICATOR);
        yamlFactory.enable(USE_PLATFORM_LINE_BREAKS);

        YAML_MAPPER = new ObjectMapper(yamlFactory);
        YAML_MAPPER.setSerializationInclusion(NON_ABSENT);
        YAML_MAPPER.setSerializationInclusion(NON_NULL);
        YAML_MAPPER.setSerializationInclusion(NON_EMPTY);
    }

    private Runner() {
    }

    public static void main(String[] args) throws InterruptedException, ParseException {
        Options options = new Options();

        options.addOption(buildCatalog());
        options.addOption(buildTags());

        CommandLineParser commandLineParser = new DefaultParser();
        PARSED_COMMAND_LINE = commandLineParser.parse(options, args);

        ClipBoardListener clipBoardListener = new ClipBoardListener();
        clipBoardListener.start();

        Thread.currentThread().join();
    }

    private static Option buildCatalog() {
        return Option.builder("c")
                .longOpt("catalog")
                .argName("catalog")
                .desc("target catalog to store markdown")
                .hasArg()
                .required(true)
                .build();
    }

    private static Option buildTags() {
        return Option.builder("t")
                .longOpt("tags")
                .argName("tags")
                .desc("tags to add to markdown file")
                .hasArgs()
                .valueSeparator(',')
                .required(true)
                .build();
    }


}
