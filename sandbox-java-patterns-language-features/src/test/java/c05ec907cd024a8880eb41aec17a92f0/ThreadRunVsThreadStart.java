package c05ec907cd024a8880eb41aec17a92f0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ThreadRunVsThreadStart
{
    @Test
    void start()
    {
        String parentThreadName = Thread.currentThread()
                                        .getName();
        Thread thread = new Thread()
        {
            public void run()
            {
                String childThreadName = Thread.currentThread()
                                               .getName();
                assertNotEquals(parentThreadName, childThreadName);
            }
        };

        thread.start(); //executes all required mechanisms to run a new thread.
    }

    @Test
    void run()
    {
        String parentThreadName = Thread.currentThread()
                                        .getName();
        Thread thread = new Thread()
        {
            public void run()
            {
                String childThreadName = Thread.currentThread()
                                               .getName();
                assertEquals(parentThreadName, childThreadName);
            }
        };

        thread.run(); //just runs overridden method.
    }
}
