package com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73;

import org.junit.jupiter.api.Test;

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
        com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Child child = new com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Child();

        assertEquals("child", com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Child.getValue());
        assertEquals("parent", com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Parent.getValue());

        assertEquals("child", com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Child.getValue());
        assertEquals("parent", com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Parent.getValue());
    }

    @Test
    void test2()
    {
        com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Parent instance = new com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Child();

        assertEquals("parent", com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Parent.getValue());
        assertEquals("child", com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Child.getValue());
    }

    @Test
    void test3()
    {
        com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Parent instance = new com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Parent();

        assertEquals("parent", com.github.ivan.kopylove.challenges.c3d2d26e4bd544f199295ddca421ff73.Parent.getValue());
    }
}
