package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.functionalinterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest
{
    @Test
    public void run()
    {
        LambdaInterface lambdaInterface = (str, num) -> {
            System.out.println("Lambda function");
            return 2L;
        };

        Assertions.assertEquals(2L, lambdaInterface.doSomething("str", 5));
    }

    @Test
    public void run01()
    {
        LambdaInterface lambdaInterface = (str, num) -> {
            System.out.println("Lambda function");
            return 2L;
        };

        Assertions.assertEquals(0, lambdaInterface.someDefaultMethod());
    }

    @Test
    public void run02()
    {

        LambdaInterface lambdaInterface = new LambdaInterface2Impl();

        Assertions.assertEquals(1, lambdaInterface.someDefaultMethod());
    }
}
