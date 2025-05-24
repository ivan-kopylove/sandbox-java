package heap.b33b3ac70c7547548a9faaa6717ea6b1;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileTest
{
    private static volatile int counter1 = 0;

        @Test
        void should_do_something_when_condition() throws InterruptedException
        {
            int tasksCount = 100_000;
            CountDownLatch latch = new CountDownLatch(tasksCount);
            ExecutorService executor = Executors.newFixedThreadPool(100);

            for (int i = 0; i < tasksCount; i++) {
                executor.submit(() -> {
                    counter1++;

                    latch.countDown();
                });
            }

            latch.await();

            System.out.println(counter1);
        }
}
