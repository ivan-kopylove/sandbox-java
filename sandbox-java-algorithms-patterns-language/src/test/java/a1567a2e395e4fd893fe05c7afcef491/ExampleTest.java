package com.github.ivan.kopylove.challenges.a1567a2e395e4fd893fe05c7afcef491;

import org.junit.jupiter.api.Test;

/**
 * functional interface playground
 */
class ExampleTest
{
    @Test
    void run()
    {
        com.github.ivan.kopylove.challenges.a1567a2e395e4fd893fe05c7afcef491.LambdaInterface lambdaInterface = (str, num) -> {
            System.out.println("Lambda function");
            return 2L;
        };

        assertEquals(2L, lambdaInterface.doSomething("str", 5));
    }

    @Test
    void run01()
    {
        com.github.ivan.kopylove.challenges.a1567a2e395e4fd893fe05c7afcef491.LambdaInterface lambdaInterface = (str, num) -> {
            System.out.println("Lambda function");
            return 2L;
        };

        assertEquals(0, lambdaInterface.someDefaultMethod());
    }

    @Test
    void run02()
    {

        com.github.ivan.kopylove.challenges.a1567a2e395e4fd893fe05c7afcef491.LambdaInterface lambdaInterface = new com.github.ivan.kopylove.challenges.a1567a2e395e4fd893fe05c7afcef491.LambdaInterface2Impl();

        assertEquals(1, lambdaInterface.someDefaultMethod());
    }
}
