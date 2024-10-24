package e294114e82ec4bbba658cb1ac4c92299;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

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
