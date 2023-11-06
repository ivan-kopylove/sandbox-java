package com.github.ivan.kopylove.sandbox.util.concurrent;

import java.util.concurrent.Semaphore;

public class LoginQueueUsingSemaphore
{

    private final Semaphore semaphore;

    public LoginQueueUsingSemaphore(int slotLimit)
    {
        semaphore = new Semaphore(slotLimit);
    }

    boolean tryLogin()
    {
        boolean result = semaphore.tryAcquire();
        if (result)
        {
            System.out.println("a");
        }
        else
        {
            System.out.println("b");
        }
        return result;
    }

    void logout()
    {
        semaphore.release();
    }

    int availableSlots()
    {
        return semaphore.availablePermits();
    }
}
