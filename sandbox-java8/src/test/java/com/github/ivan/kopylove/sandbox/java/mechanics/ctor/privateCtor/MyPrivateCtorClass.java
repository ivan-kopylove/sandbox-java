package com.github.ivan.kopylove.sandbox.java.mechanics.ctor.privateCtor;

public class MyPrivateCtorClass
{
    private static String value = "old value";

    static
    {
        value = "static initializer updated value";
    }

    private MyPrivateCtorClass()
    {
        value = "private ctor updated value";
    }

    public static String getValue()
    {
        return value;
    }
}
