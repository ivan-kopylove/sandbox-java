package com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.one;

class MyLongRunningTask implements Runnable
{
    private final com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.one.OnCompleteListener onCompleteListener;

    public MyLongRunningTask(com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.one.OnCompleteListener onCompleteListener)
    {
        this.onCompleteListener = onCompleteListener;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(5 * 1000); // sleep for 5 seconds and pretend to be working
            onCompleteListener.onComplete();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
