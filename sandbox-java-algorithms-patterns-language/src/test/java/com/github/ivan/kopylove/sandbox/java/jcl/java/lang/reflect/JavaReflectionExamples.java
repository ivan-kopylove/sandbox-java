package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.reflect;

import com.github.ivan.kopylove.sandbox.domain.Lamp;
import com.github.ivan.kopylove.sandbox.domain.Picture;
import com.github.ivan.kopylove.sandbox.domain.Wall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Private modification via standart java reflection mechanism.
 *
 * @author Ivan Kopylov
 */
public class JavaReflectionExamples
{
    /**
     * How to modify instance field
     *
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    @Test
    public void run() throws IllegalAccessException, NoSuchFieldException
    {
        Picture picture = new Picture();

        Field f1 = picture.getClass()
                          .getDeclaredField("size");
        f1.setAccessible(true);
        f1.set(picture, 500);

        Assertions.assertEquals(500, picture.getSize());
    }

    @Test
    public void run2() throws NoSuchFieldException
    {
        assertThrows(NoSuchFieldException.class, () -> {


            Picture picture = new Picture();

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
    public void run3() throws IllegalAccessException, NoSuchFieldException
    {
        Field field = Lamp.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(null, "red");
        // modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        Assertions.assertEquals("red", Lamp.getColor());
    }

    /**
     * How to modify final field
     *
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    @Test
    public void run4() throws IllegalAccessException, NoSuchFieldException
    {
        Field field = Wall.class.getDeclaredField("kek");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, "myValue");
        Assertions.assertEquals("myValue", Wall.getKek());
    }
}
