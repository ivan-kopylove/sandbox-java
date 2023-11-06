package com.github.ivan.kopylove.sandbox.java.jcl.java.util.function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertEquals(4, d1, 0);
        Assertions.assertEquals(4, d2, 0);
    }
}
