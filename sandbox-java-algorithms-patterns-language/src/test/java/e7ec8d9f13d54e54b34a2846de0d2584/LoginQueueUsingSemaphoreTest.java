package e7ec8d9f13d54e54b34a2846de0d2584;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.stream.IntStream;

import static java.util.concurrent.Executors.newFixedThreadPool;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * java concurrency example
 */
class LoginQueueUsingSemaphoreTest
{

    @Test
    public void givenLoginQueue_whenReachLimit_thenBlocked() throws InterruptedException
    {
        //given
        int slots = 10;

        ExecutorService executorService = newFixedThreadPool(slots);
        LoginQueueUsingSemaphore loginQueue = new LoginQueueUsingSemaphore(slots);

        // when
        IntStream.range(0, slots)
                 .forEach(user -> executorService.submit(loginQueue::tryLogin));
        executorService.shutdown();
        executorService.awaitTermination(10, SECONDS);

        // then
        assertThat(loginQueue.availableSlots(), equalTo(0));
        assertThat(loginQueue.tryLogin(), is(false));
    }
}