package hierarchy.concurrency;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ThreadJoinExampleTest
{
        @Test
        @DisplayName("A way to demonstrate that .join operation blocks the execution")
        void should_print_one_by_one_ascending() throws InterruptedException
        {
            for(int i = 0; i < 10; i++)
            {
                int a = i;
                Thread thread = new Thread(() -> {
                    System.out.println(a);
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
                });
//                thread.join(); // try to uncomment the call
                thread.start();
                thread.join(); // try to comment the call

            }

            System.out.println("main thread");
    }
}