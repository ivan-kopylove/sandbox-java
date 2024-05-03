package com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

class References
{
    private static final ReferenceQueue<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig> rq = new ReferenceQueue<>();

    public static ReferenceQueue<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig> getRq()
    {
        return rq;
    }

    public static void checkQueue()
    {
        Reference<? extends com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig> inq = rq.poll();
        if (inq != null)
        {
            System.out.println("In que: " + inq.get());
        }
    }
}
