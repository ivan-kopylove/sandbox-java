package com.github.ivan.kopylove.sandbox.java.mechanics.oop;

public interface InterfaceWithAPrivateMethod
{
    default String bar()
    {
        return foo();
    }

    private String foo()
    {
        return "foo";
    }
}
