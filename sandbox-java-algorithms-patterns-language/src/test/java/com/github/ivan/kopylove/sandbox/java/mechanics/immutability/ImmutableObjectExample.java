package com.github.ivan.kopylove.sandbox.java.mechanics.immutability;

/**
 * 1. no setters and not method to modify inner variables
 * 2. final class
 * 3. final variables
 */
public final class ImmutableObjectExample
{
    private final String color;
    private final int    speed;

    public ImmutableObjectExample(String color, int speed)
    {
        this.color = color;
        this.speed = speed;
    }

    public String getColor()
    {
        return color;
    }

    public int getSpeed()
    {
        return speed;
    }
}
