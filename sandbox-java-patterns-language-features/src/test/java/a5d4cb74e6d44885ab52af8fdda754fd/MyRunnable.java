package com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd;

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
