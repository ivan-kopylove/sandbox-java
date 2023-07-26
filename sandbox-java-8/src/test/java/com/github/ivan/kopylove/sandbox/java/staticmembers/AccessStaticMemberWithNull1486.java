package com.github.ivan.kopylove.sandbox.java.staticmembers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccessStaticMemberWithNull1486
{
    /**
     * null reference is prohibited be used to access static members without an exception.
     */
    @Test
    public void run()
    {
        MyClass myClass = new MyClass();
        myClass = null;
        System.out.println();

        Assertions.assertEquals("some value", MyClass.VALUE);
        Assertions.assertEquals("some text", MyClass.myMethod());
    }
}
