package heap.aa9b65a9eb99bf32ea1811233c909bb68.one;

class MyLongRunningTask implements Runnable
{
    private final OnCompleteListener onCompleteListener;

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
