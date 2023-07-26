package com.github.ivan.kopylove.sandbox.patterns.singleton.lazysingleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LazySingletonExample
{
    @Test
    public void lazySingleton()
    {
        LazySingleton instance = LazySingleton.getInstance();
        Assertions.assertNotNull(instance);
    }
}
