package com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2;

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
        com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2.MyClass myClass = new com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2.MyClass();
        myClass = null;
        System.out.println();

        assertEquals("some value", com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2.MyClass.VALUE);
        assertEquals("some text", com.github.ivan.kopylove.challenges.f01013c558cf4e759c6e01c44cc7c6f2.MyClass.myMethod());
    }
}
