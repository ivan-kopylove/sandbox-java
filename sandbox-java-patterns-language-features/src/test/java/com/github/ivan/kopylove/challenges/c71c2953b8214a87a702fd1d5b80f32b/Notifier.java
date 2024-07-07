package com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b;

class Notifier implements Runnable
{

    private final Message msg;

    public Notifier(Message msg)
    {
        this.msg = msg;
    }

    @Override
    public void run()
    {
        String name = Thread.currentThread()
                            .getName();
        System.out.println(name + " started");
        try
        {
            Thread.sleep(1000);
            synchronized (msg)
            {
                msg.setMsg(name + " Notifier work done");
                //                msg.notify();
                msg.notifyAll();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}