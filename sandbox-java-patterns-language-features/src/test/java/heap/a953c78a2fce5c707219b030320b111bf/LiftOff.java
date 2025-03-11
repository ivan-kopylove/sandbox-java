package heap.a953c78a2fce5c707219b030320b111bf;

class LiftOff implements Runnable
{
    private static int taskCount = 0;
    private final  int id        = taskCount++;
    protected      int countDown = 10;

    public LiftOff()
    {
    }

    public String status()
    {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    public void run()
    {
        while (countDown-- > 0)
        {
            System.out.print(status());
            Thread.yield();
        }
    }
}
