package a59eb3898a1c1b039238f4a1136a2587b;

class Waiter implements Runnable
{
    private final Message msg;

    public Waiter(Message m)
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