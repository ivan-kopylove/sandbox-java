package fcc6e9287e6c4986bf8c12755027c96d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.mechanics.oop.hiding
 */
class FieldsAreNotPolymorphicTest
{
    @Test
    void referenceIsFather()
    {
        Father father = new Son();
        assertEquals(1, father.i);
        assertEquals(2, father.getI());
        assertEquals(10, father.j);
        assertEquals(10, father.getJ());
    }

    @Test
    void referenceIsSon()
    {
        Son son = new Son();

        assertEquals(2, son.i);
        assertEquals(20, son.j);
        assertEquals(2, son.getI());
        assertEquals(10, son.getJ());
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
