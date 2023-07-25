package com.github.ivan.kopylove.sandbox.domain;

public class MyClonableObj implements Cloneable
{
    private String field = "value";

    public String getField()
    {
        return field;
    }

    public Object get() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
