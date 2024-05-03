package d19118ab94334147a5829b3422c505d5;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * facets:
 * - concurrency
 */
class ExecutorServiceExampleTest
{

    @Test
    void newFixedThreadPool()
    {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> System.out.println(Thread.currentThread()
                                                       .getName()));
    }
}
