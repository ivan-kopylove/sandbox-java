package heap.e74ac6522b1e4cb6a6e6fc8fbe5bb477;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.IntStream;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class ConcurrentLinkedDequeTest
{
    @Test
    void should_do_something_when_condition() throws InterruptedException
    {
        // given
        var deque = new ConcurrentLinkedDeque<String>();
        var threadPool = newFixedThreadPool(200);

        // when
        IntStream.range(0, 10_000).forEach((value) -> {
            threadPool.submit(() -> {
                deque.add(String.valueOf(value));
            });
        });

        Thread.sleep(10_000);
        // then
        MatcherAssert.assertThat(deque.size(), CoreMatchers.equalTo(10_000));
    }
}
