package c8103f556aa548d3a6267d2a64a8433f;

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
