package a86ad34965da34f3e3a4c88f5f4ef167c;

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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Thread getThread()
    {
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
            Thread.sleep(5000);
            System.out.println(this.name);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
