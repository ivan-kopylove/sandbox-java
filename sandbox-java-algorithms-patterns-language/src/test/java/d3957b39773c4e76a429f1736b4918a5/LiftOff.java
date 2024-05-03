package com.github.ivan.kopylove.challenges.d3957b39773c4e76a429f1736b4918a5;

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
