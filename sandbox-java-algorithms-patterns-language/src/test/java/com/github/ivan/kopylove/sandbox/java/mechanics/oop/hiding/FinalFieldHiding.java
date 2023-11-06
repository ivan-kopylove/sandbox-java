package com.github.ivan.kopylove.sandbox.java.mechanics.oop.hiding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinalFieldHiding
{
    @Test
    public void reference_type_b()
    {
        Child child = new Child();
        Assertions.assertEquals(20, child.f1);
        Assertions.assertEquals(10, ((Parent) child).f1);

        Assertions.assertEquals("test", child.f2);
        Assertions.assertEquals(10, ((Parent) child).f2);
    }

    @Test
    public void reference_type_a()
    {
        Parent parent = new Child();
        Assertions.assertEquals(10, parent.f1);
        Assertions.assertEquals(20, ((Child) parent).f1);

        Assertions.assertEquals(10, parent.f2);
        Assertions.assertEquals("test", ((Child) parent).f2);
    }
}

class Parent
{
    final int f1 = 10;
    final int f2 = 10;
}

class Child extends Parent
{
    int    f1 = 20;
    String f2 = "test";
}

