package com.github.ivan.kopylove.sandbox.domain;

public class MyNotClonableObj
{
    private final String field = "value";

    public String getField()
    {
        return field;
    }

    public Object get() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
