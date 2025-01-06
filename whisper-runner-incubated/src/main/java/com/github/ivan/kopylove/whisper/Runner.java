package com.github.ivan.kopylove.whisper;

import com.github.ivan.kopylove.commons.ShellExecutor;
import com.github.ivan.kopylove.commons.ShellExecutorParameters;
import com.github.ivan.kopylove.commons.StreamGobbler;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Runner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        Path workingDir = Paths.get(".");
        LOGGER.trace("workingDir: {}", workingDir);

        CommandLine cmd = parseCommandLineArgs(args);

        String inputFilePath = cmd.getOptionValue("filter");

        LOGGER.trace("input: {}", inputFilePath);

        try {

            ShellExecutorParameters shellExecutorParameters = new ShellExecutorParameters(workingDir);
            ShellExecutor shellExecutor = new ShellExecutor(shellExecutorParameters);

            Files.walk(workingDir)
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toAbsolutePath().toString().endsWith(inputFilePath))
                    .forEach(file -> {
                        LOGGER.trace("running: {}", file);
                        shellExecutor.exec("whisper " + file.getFileName());
                    });


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static CommandLine parseCommandLineArgs(String[] args) {
        Options options = new Options();

        Option input = new Option("f", "filter", true, "input file path");
        input.setRequired(true);
        options.addOption(input);


        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }
        return cmd;
    }
}
