package com.github.ivan.kopylove.challenges.e33ae699623946a9addfa4489afafb00;

import org.junit.jupiter.api.Test;

class RunnableLambdaExampleTest
{
    /**
     * Java lambdas.
     * <p>
     * A functional interface is an interface that contains only one abstract method
     * {@link Runnable}, ActionListener, Comparable are some of the examples of functional interfaces
     * <p>
     * A lambda expression is composed of three parts.
     * Argument List  | Arrow	| 	Token Body
     * (int x, int y) | ->		|	x + y
     */

    @SuppressWarnings("Convert2Lambda")
    @Test
    void run()
    {
        Runnable r1 = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("runnable 1");
            }
        };

        Runnable r2 = () -> System.out.println("runnable 2");
        r1.run();
        r2.run();
    }
}
