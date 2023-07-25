package com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case2;

public class Inner
{
    public static String value = "overrided toString() value";

    @Override
    public String toString()
    {
        return value;
    }
}
