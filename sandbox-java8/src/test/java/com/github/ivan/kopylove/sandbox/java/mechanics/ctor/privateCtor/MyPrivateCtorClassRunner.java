package com.github.ivan.kopylove.sandbox.java.mechanics.ctor.privateCtor;

import org.junit.Assert;
import org.junit.Test;

public class MyPrivateCtorClassRunner
{
    @Test
    public void run()
    {
        String value = MyPrivateCtorClass.getValue();
        Assert.assertEquals("static initializer updated value", value);
    }
}
