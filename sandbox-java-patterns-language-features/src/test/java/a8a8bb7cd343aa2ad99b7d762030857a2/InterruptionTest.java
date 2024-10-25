package a8a8bb7cd343aa2ad99b7d762030857a2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Facets:
 * - concurrency
 */
class InterruptionTest
{
    @Test
    void should_mark_thread_as_interrupted_so_that_it_moved_to_terminated_state() throws InterruptedException
    {
        Thread thread = new Thread(new InterruptedSleepingRunner());
        thread.start();
        // Giving 10 seconds to finish the job.
        Thread.sleep(5_000);

        // Let me interrupt
        assertThat(thread.getState(), equalTo(Thread.State.TIMED_WAITING));

        // when
        thread.interrupt();
        Thread.sleep(2_000);
        // then
        assertThat(thread.getState(), equalTo(Thread.State.TERMINATED));
    }
}


