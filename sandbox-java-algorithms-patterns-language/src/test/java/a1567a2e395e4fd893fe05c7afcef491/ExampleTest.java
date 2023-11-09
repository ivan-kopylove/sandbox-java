package a1567a2e395e4fd893fe05c7afcef491;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * functional interface playground
 */
class ExampleTest
{
    @Test
    void run()
    {
        LambdaInterface lambdaInterface = (str, num) -> {
            System.out.println("Lambda function");
            return 2L;
        };

        Assertions.assertEquals(2L, lambdaInterface.doSomething("str", 5));
    }

    @Test
    void run01()
    {
        LambdaInterface lambdaInterface = (str, num) -> {
            System.out.println("Lambda function");
            return 2L;
        };

        Assertions.assertEquals(0, lambdaInterface.someDefaultMethod());
    }

    @Test
    void run02()
    {

        LambdaInterface lambdaInterface = new LambdaInterface2Impl();

        Assertions.assertEquals(1, lambdaInterface.someDefaultMethod());
    }
}
