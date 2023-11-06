package com.github.ivan.kopylove.sandbox.algorithms.revertedIfCondition;

public class RevertedIfCondition
{
    /**
     * @param a e.g.: should be done
     * @param b e.g.: but not done
     * @return true if should be done, but not done. otherwise false
     */
    public static boolean run(boolean a, boolean b)
    {
        return a && !b;
    }

    /**
     * @param a e.g.: should be done
     * @param b e.g.: but not done
     * @return true if should be done, but not done. otherwise false
     */
    public static boolean run2(boolean a, boolean b)
    {
        return a && !b;
    }
}
