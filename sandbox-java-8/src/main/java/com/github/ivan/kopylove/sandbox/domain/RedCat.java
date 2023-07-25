package com.github.ivan.kopylove.sandbox.domain;

public class RedCat extends Cat
{
    private String name;

    public RedCat(final String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
