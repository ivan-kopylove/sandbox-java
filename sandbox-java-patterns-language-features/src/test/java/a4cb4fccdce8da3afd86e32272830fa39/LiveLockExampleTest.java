package a4cb4fccdce8da3afd86e32272830fa39;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.TimeUnit.MILLISECONDS;


/**
 * Facets:
 * - concurrency
 */
 class LiveLockExampleTest
{
    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);

    @Test
    void should_do_something_when_condition() throws InterruptedException
    {
        // given
        LiveLockExampleTest livelock = new LiveLockExampleTest();

        // when
        new Thread(livelock::operation1, "T1").start();
        new Thread(livelock::operation2, "T2").start();

        // then
        Thread.sleep(10_000L);
    }

    public void operation1()
    {
        try
        {
            while (true)
            {
                tryLock(lock1);
                System.out.println("lock1 acquired, trying to acquire lock2.");
                Thread.sleep(50);

                if (tryLock(lock2))
                {
                    System.out.println("lock2 acquired.");
                }
                else
                {
                    System.out.println("cannot acquire lock2, releasing lock1.");
                    lock1.unlock();
                    continue;
                }

                System.out.println("executing first operation.");
                break;
            }
            lock2.unlock();
            lock1.unlock();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    private boolean tryLock(Lock lock)
    {
        try
        {
            return lock.tryLock(50, MILLISECONDS);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void operation2()
    {
        try
        {
            while (true)
            {
                tryLock(lock2);
                System.out.println("lock2 acquired, trying to acquire lock1.");
                Thread.sleep(50);

                if (tryLock(lock1))
                {
                    System.out.println("lock1 acquired.");
                }
                else
                {
                    System.out.println("cannot acquire lock1, releasing lock2.");
                    lock2.unlock();
                    continue;
                }

                System.out.println("executing second operation.");
                break;
            }
            lock1.unlock();
            lock2.unlock();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
