package com.github.ivan.kopylove.sandbox.e294114e82ec4bbba658cb1ac4c92299;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeadlockExampleTest
{
    private final Lock    lock1    = new ReentrantLock(true);
    private final Lock    lock2    = new ReentrantLock(true);
    private       boolean unlocked = false;

    @org.junit.jupiter.api.Test
    void should_do_something_when_condition() throws InterruptedException
    {
        // given
        DeadlockExampleTest deadlock = new DeadlockExampleTest();

        // when

        new Thread(deadlock::operation1, "T1").start();
        new Thread(deadlock::operation2, "T2").start();


        // then
        Thread.sleep(10_000L);
        assertFalse(deadlock.unlocked);
    }

    public void operation1()
    {
        try
        {
            lock1.lock();
            System.out.println("lock1 acquired, waiting to acquire lock2.");
            Thread.sleep(50L);

            lock2.lock();
            System.out.println("lock2 acquired");

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

            lock1.lock();
            System.out.println("lock1 acquired");

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
