package com.github.ivan.kopylove.sandbox.patterns.listener.one;

public class MyLongRunningTask implements Runnable
{
    private OnCompleteListener onCompleteListener;

    public MyLongRunningTask(OnCompleteListener onCompleteListener)
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
