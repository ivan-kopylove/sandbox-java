package a9689a88f10d00fa72db867d004d34a55;

import org.junit.jupiter.api.Test;

import static a9689a88f10d00fa72db867d004d34a55.MyClass.VALUE;
import static a9689a88f10d00fa72db867d004d34a55.MyClass.myMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * static members example
 */
class AccessStaticMemberWithNull1486Test
{
    @Test
    void should_run_smoothly_even_class_is_nulled_before_usage()
    {
        MyClass myClass = new MyClass();
        myClass = null;

        assertEquals("some value", VALUE);
        assertEquals("some text", myMethod());
    }
}
