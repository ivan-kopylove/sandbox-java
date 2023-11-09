package b945886bc7e946778d4730a0f0c42060.one;

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