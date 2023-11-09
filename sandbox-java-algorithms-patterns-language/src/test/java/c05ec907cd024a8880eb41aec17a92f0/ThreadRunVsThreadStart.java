package c05ec907cd024a8880eb41aec17a92f0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
                Assertions.assertNotEquals(parentThreadName, childThreadName);
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
                Assertions.assertEquals(parentThreadName, childThreadName);
            }
        };

        thread.run(); //just runs overridden method.
    }
}
