package com.github.ivan.kopylove.challenges.d19118ab94334147a5829b3422c505d5;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * facets:
 * <p>
 * - concurrency
 */
class ExecutorInterfaceExampleTest
{
    @Test
    void run()
    {
        Executor executor = new Executor()
        {
            @Override
            public void execute(Runnable runnable)
            {
                runnable.run();
            }
        };
        assertEquals("main",
                     Thread.currentThread()
                           .getName());
        executor.execute(() -> assertEquals("main",
                                            Thread.currentThread()
                                                  .getName()));
    }
}
