package com.github.ivan.kopylove.sandbox.testing.mockito;

public class MyClass3
{
    private MyClass myClass;

    public MyClass3(final MyClass myClass)
    {
        this.myClass = myClass;
    }

    public String getValue()
    {
        return myClass.getSomeValue();
    }
}
