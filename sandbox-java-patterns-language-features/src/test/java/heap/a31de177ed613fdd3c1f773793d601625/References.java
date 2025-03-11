package heap.a31de177ed613fdd3c1f773793d601625;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

class References
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
