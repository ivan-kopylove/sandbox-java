package com.github.ivan.kopylove.sandbox.java.jcl.java.util.function;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

public class FunctionExample
{
    @Test
    public void main()
    {
        Function<Double, Double> square = (Double x) -> x * x;
        Function<Double, Double> square2 = SquareCalculator::square;

        double d1 = square.apply(2d);
        double d2 = square2.apply(2d);

        Assert.assertEquals(4, d1, 0);
        Assert.assertEquals(4, d2, 0);
    }
}
