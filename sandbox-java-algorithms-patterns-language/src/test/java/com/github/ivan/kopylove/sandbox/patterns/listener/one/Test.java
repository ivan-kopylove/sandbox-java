package com.github.ivan.kopylove.sandbox.patterns.listener.one;

/**
 * facets:
 * - patterns
 * - listener
 */
public class Test
{
    @org.junit.jupiter.api.Test
    public void run()
    {

        MyLongRunningTask myLongRunningTask = new MyLongRunningTask(new OnCompleteListener()
        {
            @Override
            public void onComplete()
            {
                System.out.println("Yeah, the long running task has been completed!");
            }
        });

        System.out.println("Starting the long running task.");
        myLongRunningTask.run();
    }
}