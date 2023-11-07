package e7ec8d9f13d54e54b34a2846de0d2584;

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
