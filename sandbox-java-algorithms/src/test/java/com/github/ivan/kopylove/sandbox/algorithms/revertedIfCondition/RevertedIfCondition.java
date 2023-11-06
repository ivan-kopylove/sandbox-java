package com.github.ivan.kopylove.sandbox.algorithms.revertedIfCondition;

public class RevertedIfCondition
{
    /**
     * @param a e.g.: should be done
     * @param b e.g.: but not done
     * @return true if should be done, but not done. otherwise false
     */
    public static boolean revertedIfConditionExampleOne(boolean a, boolean b)
    {
        return a && !b;
    }

    /**
     * @param a e.g.: should be done
     * @param b e.g.: but not done
     * @return true if should be done, but not done. otherwise false
     */
    public static boolean revertedIfConditionExampleTwo(boolean a, boolean b)
    {
        return a && !b;
    }
}
