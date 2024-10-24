package c3d2d26e4bd544f199295ddca421ff73;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.mechanics.oop.methodhiding
 * <p>
 * Calling static methods on instances rather than classes is a very bad practice, and should never be done.<br/>
 * This examples only for the purpose of demostration.<br/>
 */
class MethodHidingOnStaticClassMethodsTest
{
    @Test
    void test()
    {
        Child child = new Child();

        assertEquals("child", Child.getValue());
        assertEquals("parent", Parent.getValue());

        assertEquals("child", Child.getValue());
        assertEquals("parent", Parent.getValue());
    }

    @Test
    void test2()
    {
        Parent instance = new Child();

        assertEquals("parent", Parent.getValue());
        assertEquals("child", Child.getValue());
    }

    @Test
    void test3()
    {
        Parent instance = new Parent();

        assertEquals("parent", Parent.getValue());
    }
}
