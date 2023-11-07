package com.github.ivan.kopylove.sandbox.java.jcl.java.lang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Threadlocal value is accesible only from thread it is created in.
 *
 * 
 */
public class ThreadLocalExampleTest
{
    private static final ThreadLocal<Integer> THREAD_LOCAL_ONE = new ThreadLocal<>();
    private static final ThreadLocal<Integer> THREAD_LOCAL_TWO = ThreadLocal.withInitial(() -> 2);

    @Test
    public void run()
    {
        THREAD_LOCAL_ONE.set(1);
        assertEquals(Integer.valueOf(1), THREAD_LOCAL_ONE.get());
        assertEquals(Integer.valueOf(2), THREAD_LOCAL_TWO.get());
    }

    @Test
    public void startAnotherThread()
    {
        Thread thread = new Thread()
        {
            public void run()
            {
                assertNull(THREAD_LOCAL_ONE.get());
                assertEquals(Integer.valueOf(2), THREAD_LOCAL_TWO.get());
                System.out.println("finished");
            }
        };
        thread.start();
    }
}