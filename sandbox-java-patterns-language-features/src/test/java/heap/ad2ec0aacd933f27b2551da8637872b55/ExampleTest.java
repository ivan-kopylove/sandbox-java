package heap.ad2ec0aacd933f27b2551da8637872b55;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(2L, lambdaInterface.doSomething("str", 5));
    }

    @Test
    void run01()
    {
        LambdaInterface lambdaInterface = (str, num) -> {
            System.out.println("Lambda function");
            return 2L;
        };

        assertEquals(0, lambdaInterface.someDefaultMethod());
    }

    @Test
    void run02()
    {

        LambdaInterface lambdaInterface = new LambdaInterface2Impl();

        assertEquals(1, lambdaInterface.someDefaultMethod());
    }
}
