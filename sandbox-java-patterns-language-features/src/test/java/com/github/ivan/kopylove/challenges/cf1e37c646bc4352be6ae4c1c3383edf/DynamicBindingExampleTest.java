package com.github.ivan.kopylove.challenges.cf1e37c646bc4352be6ae4c1c3383edf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * facets:
 * - basic java mechanism
 * - binding
 */
class DynamicBindingExampleTest
{
    @Test
    void run()
    {
        A a = new A();
        A b = new B();

        System.out.println("a.i:" + a.i);
        System.out.println("b.i:" + b.i);

        assertEquals(10, a.i);
        assertEquals(10, b.i);
    }

    @Test
    void run2()
    {
        A a = new A();
        B b = new B();

        System.out.println("a.i:" + a.i);
        System.out.println("b.i:" + b.i);

        assertEquals(10, a.i);
        assertEquals(20, b.i);
    }
}