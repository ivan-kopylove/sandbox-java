package com.github.ivan.kopylove.sandbox.domain;

public class RedCat extends Cat
{
    private final String name;

    public RedCat(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
