package com.github.lazyf1sh.sandbox.java.mechanics.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntefacePrivateMethod
{
    @Test
    public void run()
    {
        InterfaceWithAPrivateMethod interfaceWithAPrivateMethod = new InterfaceWithAPrivateMethod()
        {

        };
        assertEquals("foo", interfaceWithAPrivateMethod.bar());
    }
}
