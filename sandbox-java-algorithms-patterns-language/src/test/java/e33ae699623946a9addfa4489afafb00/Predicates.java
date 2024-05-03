package com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Predicates
{
    @Test
    void main()
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        sumAll(numbers, jkljlkj -> true);
    }

    public int sumAll(List<Integer> numbers, Predicate<Integer> p)
    {
        int total = 0;
        for (int number : numbers)
        {
            if (p.test(number))
            {
                total += number;
            }
        }
        return total;
    }
}
