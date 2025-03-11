package heap.ad113d689d5d479e28da6c6acd5e0e1cd;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ThreadJonExampleTest
{
    @Nested
    class RenameMe
    {
        @Test
        void should_do_something_when_condition() throws InterruptedException
        {
            MyRunnable t1 = new MyRunnable("one");
            MyRunnable t2 = new MyRunnable("two");
            MyRunnable t3 = new MyRunnable("three");

            t1.getThread()
              .join();
            t2.getThread()
              .join();
            t3.getThread()
              .join();

            System.out.println("main thread point");
        }
    }
}