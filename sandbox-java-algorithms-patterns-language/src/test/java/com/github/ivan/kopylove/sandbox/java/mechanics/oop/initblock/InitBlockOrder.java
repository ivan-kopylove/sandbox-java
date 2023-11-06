package com.github.ivan.kopylove.sandbox.java.mechanics.oop.initblock;

import org.junit.jupiter.api.Test;

public class InitBlockOrder
{
    @Test
    public void run()
    {
        A a = new B();
    }
}

class A
{

    //    The non-static block:
    {
        System.out.println("Parent non-static block initialized first.");
    }
}

class B extends A
{
    //    The non-static block:
    {
        System.out.println("Child non-static block initialized second.");
    }
}