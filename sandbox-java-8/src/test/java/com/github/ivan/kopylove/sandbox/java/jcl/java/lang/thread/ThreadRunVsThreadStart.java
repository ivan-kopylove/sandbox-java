package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.thread;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreadRunVsThreadStart
{
    @Test
    public void start()
    {
        String parentThreadName = Thread.currentThread()
                                        .getName();
        Thread thread = new Thread()
        {
            public void run()
            {
                String childThreadName = Thread.currentThread()
                                               .getName();
                Assertions.assertNotEquals(parentThreadName, childThreadName);
            }
        };

        thread.start(); //executes all required mechanisms to run a new thread.
    }

    @Test
    public void run()
    {
        String parentThreadName = Thread.currentThread()
                                        .getName();
        Thread thread = new Thread()
        {
            public void run()
            {
                String childThreadName = Thread.currentThread()
                                               .getName();
                Assertions.assertEquals(parentThreadName, childThreadName);
            }
        };

        thread.run(); //just runs overridden method.
    }
}
