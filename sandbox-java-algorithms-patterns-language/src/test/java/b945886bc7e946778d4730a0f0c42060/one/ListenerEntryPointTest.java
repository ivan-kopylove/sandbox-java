package com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.one;

/**
 * facets:
 * - patterns
 * - listener
 */
class ListenerEntryPointTest
{
    @org.junit.jupiter.api.Test
    public void run()
    {

        com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.one.MyLongRunningTask myLongRunningTask = new com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.one.MyLongRunningTask(new com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.one.OnCompleteListener()
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