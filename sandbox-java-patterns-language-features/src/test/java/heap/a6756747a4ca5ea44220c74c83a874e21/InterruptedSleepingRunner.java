package heap.a6756747a4ca5ea44220c74c83a874e21;

class InterruptedSleepingRunner implements Runnable
{
    @Override
    public void run()
    {
        doHeavyJob();
    }

    private void doHeavyJob()
    {
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            System.out.println(i + " " + i * 2);
            if (Thread.currentThread()
                      .isInterrupted())
            {
                System.out.println("My thread interrupted");
                break;
            }
            else
            {
                sleep();
            }
        }
    }

    protected void sleep()
    {
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread()
                  .interrupt();
        }
    }
}