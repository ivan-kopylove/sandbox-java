package com.github.ivan.kopylove.sandbox.patterns.singleton.enumsingleton;

public enum MyEnumSingleton
{
    INSTANCE;

    public static final String RETURN_RESULT = "some calculated value";

    MyEnumSingleton()
    {

    }

    public String utilMethod()
    {
        return RETURN_RESULT;
    }
}
