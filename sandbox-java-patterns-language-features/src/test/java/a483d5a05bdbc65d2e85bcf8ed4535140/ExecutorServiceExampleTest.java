package a483d5a05bdbc65d2e85bcf8ed4535140;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Facets:
 * - concurrency
 */
class ExecutorServiceExampleTest
{

    @Test
    void should_run_a_thread() throws InterruptedException
    {
        AtomicBoolean called = new AtomicBoolean(false);

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            called.set(true);
            System.out.println(Thread.currentThread().getName());
        });
        executor.close();

        Thread.sleep(50);
        assertTrue(called.get());
    }
}
