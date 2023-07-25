package com.github.ivan.kopylove.sandbox.java.mechanics.oop.initblock.staticinitializerinnestedclass.example1;

import org.junit.Test;

public class StaticBlockNestedClass
{

    @Test
    public void run()
    {
        System.out.println(Child.ID);
    }

    @Test
    public void run2()
    {
        new Child();
    }
}

