package com.github.ivan.kopylove.sandbox.java.plus;

import org.junit.jupiter.api.Test;

public class PlusOperationBetweenClasses
{

    @Test
    public void twoClassesCompileError()
    {
        //        System.out.println(new ClassOne() + new ClassTwo());
    }

    @Test
    public void oneOfTheClassesIsStringNoCompileError()
    {
        System.out.println("My string " + new ClassTwo());
        System.out.println("My string " + new ClassTwo());
    }
}
