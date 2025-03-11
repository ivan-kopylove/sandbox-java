package heap.aa9b65a9eb99bf32ea1811233c909bb68.one;

import org.junit.jupiter.api.Test;

/**
 * facets:
 * - patterns
 * - listener
 */
class ListenerEntryPointTest
{
    @Test
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