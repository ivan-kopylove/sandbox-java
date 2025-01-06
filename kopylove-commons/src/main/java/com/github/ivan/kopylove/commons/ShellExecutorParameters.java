package com.github.ivan.kopylove.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;
import static java.util.concurrent.TimeUnit.SECONDS;

public class ShellExecutorParameters
{
    private static final Logger          LOGGER            = LoggerFactory.getLogger(ShellExecutorParameters.class);
    private final        Path            workingDir;
    private final        ExecutorService streamGobblerPool = newFixedThreadPool(2);

    public ShellExecutorParameters(Path workingDir)
    {
        this.workingDir = workingDir;

        Thread unfortunateHook = new Thread(() -> shutDownGobblerExecutor(streamGobblerPool));
        Runtime.getRuntime().addShutdownHook(unfortunateHook);
    }

    private static void shutDownGobblerExecutor(ExecutorService executorService)
    {
        executorService.shutdown();
        try
        {
            if (!executorService.awaitTermination(15, SECONDS))
            {
                executorService.shutdownNow();
            }
        }
        catch (InterruptedException e)
        {
            LOGGER.error("gobbler shutdown error", e);
            executorService.shutdownNow();
        }
    }

    public ExecutorService getStreamGobblerPool()
    {
        return streamGobblerPool;
    }

    public Path getWorkingDir()
    {
        return workingDir;
    }
}
