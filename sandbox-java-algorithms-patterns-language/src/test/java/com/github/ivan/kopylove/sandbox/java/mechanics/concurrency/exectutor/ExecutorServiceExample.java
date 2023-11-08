package com.github.ivan.kopylove.sandbox.java.mechanics.concurrency.exectutor;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class ExecutorServiceExample
{

    @Test
    public void newFixedThreadPool()
    {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> System.out.println(Thread.currentThread()
                                                       .getName()));
    }
}
