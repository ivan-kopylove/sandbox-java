package com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2;

import org.junit.jupiter.api.Test;

import static com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2.MyClass.VALUE;
import static com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2.MyClass.myMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * static members example
 */
class AccessStaticMemberWithNull1486Test
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

        assertEquals("some value", VALUE);
        assertEquals("some text", myMethod());
    }
}
