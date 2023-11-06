package com.github.ivan.kopylove.sandbox.java.mechanics.oop.hiding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FieldsAreNotPolymorphic
{
    @Test
    public void referenceIsFather()
    {
        Father father = new Son();
        Assertions.assertEquals(1, father.i);
        Assertions.assertEquals(2, father.getI());
        Assertions.assertEquals(10, father.j);
        Assertions.assertEquals(10, father.getJ());
    }

    @Test
    public void referenceIsSon()
    {
        Son son = new Son();

        Assertions.assertEquals(2, son.i);
        Assertions.assertEquals(20, son.j);
        Assertions.assertEquals(2, son.getI());
        Assertions.assertEquals(10, son.getJ());
    }
}

class Father
{

    int i = 1;
    int j = 10;

    public int getI()
    {
        return i;
    }

    public int getJ()
    {
        return j;
    }
}

class Son extends Father
{

    int i = 2;
    int j = 20;

    @Override
    public int getI()
    {
        return i;
    }
}
