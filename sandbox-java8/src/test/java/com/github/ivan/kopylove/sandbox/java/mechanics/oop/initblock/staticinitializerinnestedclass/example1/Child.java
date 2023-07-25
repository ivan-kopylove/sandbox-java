package com.github.ivan.kopylove.sandbox.java.mechanics.oop.initblock.staticinitializerinnestedclass.example1;

public class Child extends Parent
{
    static String CHILD_ID;

    static
    {
        System.out.println("Child static initializer");
    }
}
