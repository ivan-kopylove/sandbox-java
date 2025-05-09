package heap.a31de177ed613fdd3c1f773793d601625;

import org.junit.jupiter.api.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/**
 * facets
 * - thinking-in-java
 * - java-mechanism
 * <p>
 * SoftReference > Weak Reference > PhantomReference
 */
class ReferencesTest
{
    @Test
    void run()
    {
        int size = 10;
        LinkedList<SoftReference<VeryBig>> sa = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            sa.add(new SoftReference<>(new VeryBig("Soft " + i), References.getRq()));
            System.out.println("Just created: " + sa.getLast());
            References.checkQueue();
        }
        LinkedList<WeakReference<VeryBig>> wa = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            wa.add(new WeakReference<VeryBig>(new VeryBig("Weak " + i)));
            System.out.println("Just created: " + wa.getLast());
            References.checkQueue();
        }
        SoftReference<VeryBig> s = new SoftReference<>(new VeryBig("Soft"));
        WeakReference<VeryBig> w = new WeakReference<>(new VeryBig("Weak"));
        System.gc();

        LinkedList<PhantomReference<VeryBig>> pa = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            pa.add(new PhantomReference<>(new VeryBig("Phanom " + i), References.getRq()));
            System.out.println("Just created: " + pa.getLast());
            References.checkQueue();
        }
        System.gc();
    }
}