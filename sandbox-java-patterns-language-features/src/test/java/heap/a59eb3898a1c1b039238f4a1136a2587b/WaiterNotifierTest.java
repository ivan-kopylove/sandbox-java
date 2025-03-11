package heap.a59eb3898a1c1b039238f4a1136a2587b;

import org.junit.jupiter.api.Test;

/**
 * Facets:
 * - concurrency
 * https://www.journaldev.com/1037/java-thread-wait-notify-and-notifyall-example
 */
class WaiterNotifierTest
{
    @Test
    void run() throws InterruptedException
    {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter, "waiter").start();

        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();

        Thread.sleep(5000);
        System.out.println("All the threads are started");
    }
}
