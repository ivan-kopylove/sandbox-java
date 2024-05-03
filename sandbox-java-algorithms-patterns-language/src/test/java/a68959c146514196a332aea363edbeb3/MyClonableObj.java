package com.github.ivan.kopylove.challenges.a68959c146514196a332aea363edbeb3;

class MyClonableObj implements Cloneable
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
