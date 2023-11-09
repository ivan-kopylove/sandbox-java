package f01013c558cf4e759c6e01c44cc7c6f2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * static members example
 */
class AccessStaticMemberWithNull1486
{
    /**
     * null reference is prohibited be used to access static members without an exception.
     */
    @Test
    void run()
    {
        MyClass myClass = new MyClass();
        myClass = null;
        System.out.println();

        assertEquals("some value", MyClass.VALUE);
        assertEquals("some text", MyClass.myMethod());
    }
}
