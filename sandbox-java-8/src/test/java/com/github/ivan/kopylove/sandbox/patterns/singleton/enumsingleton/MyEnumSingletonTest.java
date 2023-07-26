package com.github.ivan.kopylove.sandbox.patterns.singleton.enumsingleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyEnumSingletonTest
{
    @Test
    public void run()
    {
        String result = MyEnumSingleton.INSTANCE.utilMethod();
        Assertions.assertEquals(MyEnumSingleton.RETURN_RESULT, result);
    }
}