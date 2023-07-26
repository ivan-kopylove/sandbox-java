package com.github.ivan.kopylove.sandbox.java.mechanics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
