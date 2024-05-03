package com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;

/**
 * java.util.* playground
 */
class JavaCachesVariableWhenOverridesWithReflectionTest
{
    @Test
    @Disabled
    void run() throws NoSuchFieldException, IllegalAccessException
    {
        setValue(com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.class.getDeclaredField("FINAL_STR"), "overrided");
        setValue(com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.class.getDeclaredField("STR"), "overrided");
        setValue(com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.class.getDeclaredField("intFinalValue"), 10000);
        setValue(com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.class.getDeclaredField("intValue"), 10000);

        Supplier<String> supplier = () -> "overrided";
        setValue(com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.class.getDeclaredField("SUPPLIER"), supplier);

        assertEquals("initial", com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.getFinalStr());
        assertEquals("overrided", com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.getSTR());
        assertEquals("overrided", com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.getValueFromSuplier());
        assertEquals(5000, com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.getIntFinalValue());
        assertEquals(10000, com.github.ivan.kopylove.challenges.b75f8767ba064db4a4caf9a54cb1e400.ObjectHolder.getIntValue());
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
