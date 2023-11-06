package com.github.ivan.kopylove.sandbox.java.exercises.thinking.in.java;

public class VeryBig
{
    private static final int    SIZE = 10000;
    private final        long[] la   = new long[SIZE];
    private final        String id;

    public VeryBig(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return id;
    }

    @Override
    protected void finalize()
    {
        System.out.println("Finalizing " + id);
    }
}
