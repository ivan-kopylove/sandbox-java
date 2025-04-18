package heap.adbae62a2ab788e42bd700a1291cd33d2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * facets:
 * - patterns
 * - singleton
 */
class MyEnumLazySingletonTest
{
    @Test
    @Disabled
    public void mockSingleton()
    {
        assertThrows(IllegalArgumentException.class, () -> {


            Field field = MyEnumSingletonImpl.class.getDeclaredField("INSTANCE");

            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

            field.setAccessible(true);

            // next operation is impossible, because static field instance is of type MyEnumSingletonImpl
            // and not MyEnumSingleton
            field.set(null, new MyEnumSingletonMock());
        });
    }
}