package heap.adde14bb5d3547b2bfa5ae9b1e820acaf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.mechanics.oop.hiding
 */
class FinalFieldHidingTest
{
    @Test
    void reference_type_b()
    {
        Child child = new Child();
        assertEquals(20, child.f1);
        assertEquals(10, ((Parent) child).f1);

        assertEquals("test", child.f2);
        assertEquals(10, ((Parent) child).f2);
    }

    @Test
    void reference_type_a()
    {
        Parent parent = new Child();
        assertEquals(10, parent.f1);
        assertEquals(20, ((Child) parent).f1);

        assertEquals(10, parent.f2);
        assertEquals("test", ((Child) parent).f2);
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

