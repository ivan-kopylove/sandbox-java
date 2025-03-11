package heap.a639ff926569348384c5827df9a23a00b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Facets:
 * - concurrency
 */
class DeadlockExampleTest
{
    @Test
    void should_maintain_examplanatory_deadlock() throws InterruptedException
    {
        // given
        SomeJob deadlock = new SomeJob();

        // when
        new Thread(deadlock::operation1, "Thread1").start();
        new Thread(deadlock::operation2, "Thread2").start();

        // then
        Thread.sleep(10_000L);
        assertFalse(deadlock.unlocked);
    }
}
