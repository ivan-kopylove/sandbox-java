package com.github.ivan.kopylove.challenges.b06f98fbd53b4903b812a0208dd1bc7b;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java.util.function experiments
 */
class FunctionExampleTest
{
    @Test
    void main()
    {
        Function<Double, Double> square = (Double x) -> x * x;
        Function<Double, Double> square2 = SquareCalculator::square;

        double d1 = square.apply(2d);
        double d2 = square2.apply(2d);

        assertEquals(4, d1, 0);
        assertEquals(4, d2, 0);
    }
}
