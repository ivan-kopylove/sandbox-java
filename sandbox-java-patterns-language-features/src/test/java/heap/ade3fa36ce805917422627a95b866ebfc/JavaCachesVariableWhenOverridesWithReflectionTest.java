package heap.ade3fa36ce805917422627a95b866ebfc;

import org.junit.jupiter.api.Disabled;
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
    @Disabled
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
