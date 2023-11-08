package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.functionalinterface;

/**
 * The default implementation of smth.
 */
@FunctionalInterface
public interface LambdaInterface
{
    long doSomething(String str, int num);

    default int someDefaultMethod()
    {
        return 0;
    }
}
