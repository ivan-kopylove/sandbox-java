package com.github.ivan.kopylove.sandbox.java.mechanics.oop.methodhiding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Calling static methods on instances rather than classes is a very bad practice, and should never be done.<br/>
 * This examples only for the purpose of demostration.<br/>
 */
public class MethodHidingOnStaticClassMethods
{
    @Test
    public void test()
    {
        Child child = new Child();

        assertEquals("child", Child.getValue());
        assertEquals("parent", Parent.getValue());

        assertEquals("child", Child.getValue());
        assertEquals("parent", Parent.getValue());
    }

    @Test
    public void test2()
    {
        Parent instance = new Child();

        assertEquals("parent", Parent.getValue());
        assertEquals("child", Child.getValue());
    }

    @Test
    public void test3()
    {
        Parent instance = new Parent();

        assertEquals("parent", Parent.getValue());
    }
}
