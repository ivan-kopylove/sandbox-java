package heap.a639ff926569348384c5827df9a23a00b;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SomeJob
{
    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);
    boolean unlocked = false;

    public void operation1()
    {
        try
        {
            lock1.lock();
            System.out.println("lock1 acquired, waiting to acquire lock2.");
            Thread.sleep(50L);

            System.out.println("operation1 is trying to acquire lock2...");
            lock2.lock();
            System.out.println("lock2 acquired by operation1");

            System.out.println("executing first operation.");

            lock2.unlock();
            lock1.unlock();
            unlocked = true;
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
            lock2.lock();
            System.out.println("lock2 acquired, waiting to acquire lock1.");
            Thread.sleep(50L);

            System.out.println("operation2 is trying to acquire lock1...");
            lock1.lock();
            System.out.println("lock1 acquired by operation2");

            System.out.println("executing second operation.");

            lock1.unlock();
            lock2.unlock();
            unlocked = true;
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
