package com.github.ivan.kopylove.sandbox.java.mechanics.ctor.privateCtor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyPrivateCtorClassRunner
{
    @Test
    public void run()
    {
        String value = MyPrivateCtorClass.getValue();
        Assertions.assertEquals("static initializer updated value", value);
    }
}
