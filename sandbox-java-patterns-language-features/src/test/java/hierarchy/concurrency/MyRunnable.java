package hierarchy.concurrency;

class MyRunnable implements Runnable
{
    private String name;
    private Thread thread;

    public MyRunnable(String threadName)
    {
        this.name = threadName;
        thread = new Thread(this, threadName);
        thread.start();
    }

    public Thread getThread()
    {
        int abc;
        return thread;
    }

    public void setThread(Thread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println(this.name);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
