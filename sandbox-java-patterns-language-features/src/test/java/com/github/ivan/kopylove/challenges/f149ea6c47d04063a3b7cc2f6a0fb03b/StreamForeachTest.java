package com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * java streams playground
 */
class StreamForeachTest
{
    @Test
    void main()
    {
        Random random = new Random();
        random.ints()
              .limit(10)
              .forEach(System.out::println);
    }
}
