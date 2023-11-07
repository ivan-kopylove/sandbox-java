package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.functionalinterface;

/**
 * The default implementation of smth.
 *
 * 
 */
public class LambdaInterface2Impl implements LambdaInterface
{

    @Override
    public long doSomething(String str, int num)
    {
        return 0;
    }

    /**
     * Default method can be overridden.
     *
     * @return
     */
    @Override
    public int someDefaultMethod()
    {
        return 1;
    }
}
