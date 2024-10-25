package a7a1c4655caeaa64bf5aa5d0057ec8085;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Threadlocal value is accesible only from thread it is created in.
 */
class ThreadLocalExampleTest
{
    private static final ThreadLocal<Integer> THREAD_LOCAL_ONE = new ThreadLocal<>();
    private static final ThreadLocal<Integer> THREAD_LOCAL_TWO = ThreadLocal.withInitial(() -> 2);

    @Test
    void run()
    {
        THREAD_LOCAL_ONE.set(1);
        assertEquals(Integer.valueOf(1), THREAD_LOCAL_ONE.get());
        assertEquals(Integer.valueOf(2), THREAD_LOCAL_TWO.get());
    }

    @Test
    void startAnotherThread()
    {
        Thread thread = new Thread()
        {
            public void run()
            {
                assertNull(THREAD_LOCAL_ONE.get());
                assertEquals(Integer.valueOf(2), THREAD_LOCAL_TWO.get());
                System.out.println("finished");
            }
        };
        thread.start();
    }
}