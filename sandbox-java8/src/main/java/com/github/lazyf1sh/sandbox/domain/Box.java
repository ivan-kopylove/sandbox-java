package com.github.lazyf1sh.sandbox.domain;

public class Box<T>
{
    private T t;

    public T getT()
    {
        return t;
    }

    public void setT(final T t)
    {
        this.t = t;
    }
}
