package com.github.ivan.kopylove.sandbox.testing.mockito;

class MyClass3
{
    private final MyClass myClass;

    public MyClass3(MyClass myClass)
    {
        this.myClass = myClass;
    }

    public String getValue()
    {
        return myClass.getSomeValue();
    }
}
