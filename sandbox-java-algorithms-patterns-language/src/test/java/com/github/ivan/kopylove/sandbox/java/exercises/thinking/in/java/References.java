package com.github.ivan.kopylove.sandbox.java.exercises.thinking.in.java;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class References
{
    private static final ReferenceQueue<VeryBig> rq = new ReferenceQueue<>();

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
