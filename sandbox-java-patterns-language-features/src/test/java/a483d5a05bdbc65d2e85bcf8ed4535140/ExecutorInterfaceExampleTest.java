package a483d5a05bdbc65d2e85bcf8ed4535140;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Facets:
 * <p>
 * - concurrency
 */
class ExecutorInterfaceExampleTest
{
    @Test
    void run()
    {
        Executor executor = new Executor()
        {
            @Override
            public void execute(Runnable runnable)
            {
                runnable.run();
            }
        };
        assertEquals("main", Thread.currentThread().getName());
        executor.execute(() -> assertEquals("main", Thread.currentThread().getName()));
    }
}
