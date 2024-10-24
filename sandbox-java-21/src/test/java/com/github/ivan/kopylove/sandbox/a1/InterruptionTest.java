package com.github.ivan.kopylove.sandbox.a1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class InterruptionTest
{
    @Test
    void should_mark_thread_as_interrupted_so_that_it_moved_to_terminated_state() throws InterruptedException
    {
        Thread thread = new Thread(new InterruptedSleepingRunner());
        thread.start();
        // Giving 10 seconds to finish the job.
        Thread.sleep(10_000);

        // Let me interrupt
        assertThat(thread.getState(), equalTo(Thread.State.TIMED_WAITING));

        // when
        thread.interrupt();
        assertThat(thread.getState(), equalTo(Thread.State.RUNNABLE));
        Thread.sleep(5_000);
        // then
        assertThat(thread.getState(), equalTo(Thread.State.TERMINATED));
    }
}


