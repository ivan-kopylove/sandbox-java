package com.github.ivan.kopylove.sandbox.java.jcl.java.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;

public class JavaCachesVariableWhenOverridesWithReflection
{
    @Test
    public void run() throws NoSuchFieldException, IllegalAccessException
    {
        setValue(ObjectHolder.class.getDeclaredField("FINAL_STR"), "overrided");
        setValue(ObjectHolder.class.getDeclaredField("STR"), "overrided");
        setValue(ObjectHolder.class.getDeclaredField("intFinalValue"), 10000);
        setValue(ObjectHolder.class.getDeclaredField("intValue"), 10000);

        Supplier<String> supplier = () -> "overrided";
        setValue(ObjectHolder.class.getDeclaredField("SUPPLIER"), supplier);

        Assertions.assertEquals("initial", ObjectHolder.getFinalStr());
        Assertions.assertEquals("overrided", ObjectHolder.getSTR());
        Assertions.assertEquals("overrided", ObjectHolder.getValueFromSuplier());
        Assertions.assertEquals(5000, ObjectHolder.getIntFinalValue());
        Assertions.assertEquals(10000, ObjectHolder.getIntValue());
    }

    private void setValue(Field field, Object newValue) throws NoSuchFieldException, IllegalAccessException
    {
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, newValue);
    }
}
