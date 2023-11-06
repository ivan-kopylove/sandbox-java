package com.github.ivan.kopylove.sandbox.java.binding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicBindingExampleTest
{
    @Test
    public void run()
    {
        A a = new A();
        A b = new B();

        System.out.println("a.i:" + a.i);
        System.out.println("b.i:" + b.i);

        Assertions.assertEquals(10, a.i);
        Assertions.assertEquals(10, b.i);
    }

    @Test
    public void run2()
    {
        A a = new A();
        B b = new B();

        System.out.println("a.i:" + a.i);
        System.out.println("b.i:" + b.i);

        Assertions.assertEquals(10, a.i);
        Assertions.assertEquals(20, b.i);
    }
}