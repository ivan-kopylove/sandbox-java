package heap.ac2510e9b3d2109bda7f62fbb6b163fd7;

import java.util.concurrent.Semaphore;

class LoginQueueUsingSemaphore
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
