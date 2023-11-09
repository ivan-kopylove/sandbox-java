package d19118ab94334147a5829b3422c505d5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;

/**
 * facets:
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
        Assertions.assertEquals("main",
                                Thread.currentThread()
                                      .getName());
        executor.execute(() -> Assertions.assertEquals("main",
                                                       Thread.currentThread()
                                                             .getName()));
    }
}
