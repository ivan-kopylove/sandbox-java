package heap.b860f78d6f8b4bf984de3da73d06edac;

import org.junit.jupiter.api.Test;

/**
 * @see <a href="obsidian://search/?vault=notes&query=b860f78d">obsidian</a>
 * @see <a href="https://ivan-kopylove.github.io/b860f78d-6f8b-4bf9-84de-3da73d06edac">blog</a>
 */
public class BasicNotificationTest
{
    static Object lock = new Object();

    @Test
    void should_resume_execution_once_notify_called() throws InterruptedException
    {
        new Thread(() -> {
            synchronized (lock)
            {
                try
                {
                    System.out.println("Thread A: Waiting");
                    lock.wait();
                    System.out.println("Thread A: Resumed");
                }
                catch (InterruptedException e)
                {
                }
            }
        }).start();

        Thread.sleep(3_000); // Ensure ordering

        synchronized (lock)
        {
            System.out.println("Thread B: Notifying");
            lock.notify();
        }
    }
}