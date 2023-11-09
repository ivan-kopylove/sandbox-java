package ca583342f7184f9ab6c7e2422f2f695f;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.util.* playground
 */
class JavaCachesVariableWhenOverridesWithReflectionTest
{
    @Test
    void run() throws NoSuchFieldException, IllegalAccessException
    {
        setValue(ObjectHolder.class.getDeclaredField("FINAL_STR"), "overrided");
        setValue(ObjectHolder.class.getDeclaredField("STR"), "overrided");
        setValue(ObjectHolder.class.getDeclaredField("intFinalValue"), 10000);
        setValue(ObjectHolder.class.getDeclaredField("intValue"), 10000);

        Supplier<String> supplier = () -> "overrided";
        setValue(ObjectHolder.class.getDeclaredField("SUPPLIER"), supplier);

        assertEquals("initial", ObjectHolder.getFinalStr());
        assertEquals("overrided", ObjectHolder.getSTR());
        assertEquals("overrided", ObjectHolder.getValueFromSuplier());
        assertEquals(5000, ObjectHolder.getIntFinalValue());
        assertEquals(10000, ObjectHolder.getIntValue());
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
