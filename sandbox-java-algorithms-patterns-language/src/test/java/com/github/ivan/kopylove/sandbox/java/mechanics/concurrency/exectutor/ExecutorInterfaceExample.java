package com.github.ivan.kopylove.sandbox.java.mechanics.concurrency.exectutor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;

/**
 *
 */
public class ExecutorInterfaceExample
{
    @Test
    public void run()
    {
        Executor executor = new Executor()
        {
            @Override
            public void execute(Runnable runnable)
            {
                runnable.run();
            }
        };
        Assertions.assertEquals("main",
                                Thread.currentThread()
                                      .getName());
        executor.execute(() -> Assertions.assertEquals("main",
                                                       Thread.currentThread()
                                                             .getName()));
    }
}
