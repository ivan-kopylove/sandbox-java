package com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b;

class Waiter implements Runnable
{
    private final com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Message msg;

    public Waiter(com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Message m)
    {
        this.msg = m;
    }

    @Override
    public void run()
    {
        String name = Thread.currentThread()
                            .getName();
        synchronized (msg)
        {
            try
            {
                System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
                msg.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
            //process the message now
            System.out.println(name + " processed: " + msg.getMsg());
        }
    }
}