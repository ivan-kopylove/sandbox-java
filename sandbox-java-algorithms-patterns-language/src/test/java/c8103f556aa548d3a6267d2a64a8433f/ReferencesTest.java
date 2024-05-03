package com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f;

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
        LinkedList<SoftReference<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig>> sa = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            sa.add(new SoftReference<>(new com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig("Soft " + i), com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.References.getRq()));
            System.out.println("Just created: " + sa.getLast());
            com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.References.checkQueue();
        }
        LinkedList<WeakReference<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig>> wa = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            wa.add(new WeakReference<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig>(new com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig("Weak " + i)));
            System.out.println("Just created: " + wa.getLast());
            com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.References.checkQueue();
        }
        SoftReference<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig> s = new SoftReference<>(new com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig("Soft"));
        WeakReference<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig> w = new WeakReference<>(new com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig("Weak"));
        System.gc();

        LinkedList<PhantomReference<com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig>> pa = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            pa.add(new PhantomReference<>(new com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.VeryBig("Phanom " + i), com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.References.getRq()));
            System.out.println("Just created: " + pa.getLast());
            com.github.ivan.kopylove.challenges.c8103f556aa548d3a6267d2a64a8433f.References.checkQueue();
        }
        System.gc();
    }
}