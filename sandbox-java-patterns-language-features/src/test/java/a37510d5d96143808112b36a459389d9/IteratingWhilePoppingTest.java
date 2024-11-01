package a37510d5d96143808112b36a459389d9;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentLinkedDeque;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Removing elements from List<> while iterating leads to exception (btw, which one?), because iterator (... what?)
 * <p>
 * Based on that idea, the experiment about my idea if I can pop elements from the deque while iterating on the que.
 */
public class IteratingWhilePoppingTest
{
    @Test
    void should_remove_elements_from_queue_without_exceptions()
    {
        // given
        var deque = new ConcurrentLinkedDeque<>();

        // when
        deque.add("some value");
        deque.add("some value");

        // when
        while (!deque.isEmpty())
        {
            deque.pop();
        }

        // then
        assertTrue(deque.isEmpty());
    }
}
