package com.github.ivan.kopylove.sandbox.java.mechanics.oop.methodhiding;

public class Child extends Parent
{
    public static String getValue() // hides Parent.getValue()
    {
        return "child";
    }
}
