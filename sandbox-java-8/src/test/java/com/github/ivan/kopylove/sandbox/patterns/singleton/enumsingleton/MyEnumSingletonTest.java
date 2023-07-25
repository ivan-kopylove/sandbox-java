package com.github.ivan.kopylove.sandbox.patterns.singleton.enumsingleton;

import org.junit.Assert;
import org.junit.Test;

public class MyEnumSingletonTest
{
    @Test
    public void run()
    {
        String result = MyEnumSingleton.INSTANCE.utilMethod();
        Assert.assertEquals(MyEnumSingleton.RETURN_RESULT, result);
    }
}