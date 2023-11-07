package com.github.ivan.kopylove.sandbox.patterns.singleton.singletonmockfailed;

/**
 * This enum will actually be compiled to something like:
 * <p/>
 * public final class MySingleton {
 * public final static MySingleton INSTANCE = new MySingleton();
 * private MySingleton(){}
 * }
 *
 * 
 */
public enum MyEnumSingletonImpl implements MyEnumSingleton
{
    INSTANCE;

    MyEnumSingletonImpl()
    {

    }

    public String someMethod()
    {
        return "test";
    }
}
