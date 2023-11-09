package f01013c558cf4e759c6e01c44cc7c6f2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertEquals("some value", MyClass.VALUE);
        Assertions.assertEquals("some text", MyClass.myMethod());
    }
}
