package com.github.ivan.kopylove.sandbox.a1;

import org.junit.jupiter.api.Test;

class InterruptionTest
{
    @Test
    void basic() throws InterruptedException
    {
        Thread thread = new Thread(new InterruptedSleepingRunner());
        thread.start();
        // Giving 10 seconds to finish the job.
        Thread.sleep(10_000);
        // Let me interrupt
        thread.interrupt();
    }
}


