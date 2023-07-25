package com.github.ivan.kopylove.sandbox.patterns.singleton.lazysingleton;

import org.junit.Assert;
import org.junit.Test;

public class LazySingletonExample
{
    @Test
    public void lazySingleton()
    {
        LazySingleton instance = LazySingleton.getInstance();
        Assert.assertNotNull(instance);
    }
}
