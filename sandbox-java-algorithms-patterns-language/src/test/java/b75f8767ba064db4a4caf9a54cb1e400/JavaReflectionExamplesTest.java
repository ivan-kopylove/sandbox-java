package com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Private modification via standard java reflection mechanism
 * <p>
 * tags:
 * - jcl
 * - reflection mechanisms
 */
class JavaReflectionExamplesTest
{
    /**
     * How to modify instance field
     *
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    @Test
    void run() throws IllegalAccessException, NoSuchFieldException
    {
        com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.Picture picture = new com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.Picture();

        Field f1 = picture.getClass()
                          .getDeclaredField("size");
        f1.setAccessible(true);
        f1.set(picture, 500);

        assertEquals(500, picture.getSize());
    }

    @Test
    void run2()
    {
        assertThrows(NoSuchFieldException.class, () -> {


            com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.Picture picture = new com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.Picture();

            Field f1 = picture.getClass()
                              .getField("size");
        });
    }

    /**
     * How to modify static field
     *
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    @Test
    void run3() throws IllegalAccessException, NoSuchFieldException
    {
        Field field = com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.Lamp.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(null, "red");
        // modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        assertEquals("red", com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.Lamp.getColor());
    }
}
