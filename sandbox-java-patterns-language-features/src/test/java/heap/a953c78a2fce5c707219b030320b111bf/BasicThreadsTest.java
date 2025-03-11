package heap.a953c78a2fce5c707219b030320b111bf;

import org.junit.jupiter.api.Test;

/**
 * java.mechanics.concurrency.threadYield
 * <p>
 * Examples from Eckel's book.
 */
class BasicThreadsTest
{
    @Test
    void main()
    {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
