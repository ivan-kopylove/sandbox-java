package hierarchy.concurrency;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ThreadJoinExampleTest
{
    @Nested
    class RenameMe
    {
        @Test
        @DisplayName("A way to demonstrate that .join operation blocks the execution")
        void should_do_something_when_condition() throws InterruptedException
        {

            for(int i = 0; i < 10; i++)
            {
                MyRunnable t = new MyRunnable(String.valueOf(i));
                t.getThread().join();
            }

            System.out.println("main thread");
        }
    }
}