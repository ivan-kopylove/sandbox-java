package com.github.lazyf1sh.sandbox.java.exercises.thinking.in.java;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class References
{
    private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<>();

    public static ReferenceQueue<VeryBig> getRq()
    {
        return rq;
    }

    public static void checkQueue()
    {
        Reference<? extends VeryBig> inq = rq.poll();
        if (inq != null)
        {
            System.out.println("In que: " + inq.get());
        }
    }
}
