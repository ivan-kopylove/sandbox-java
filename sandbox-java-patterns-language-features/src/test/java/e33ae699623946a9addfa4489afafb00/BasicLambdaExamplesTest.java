package e33ae699623946a9addfa4489afafb00;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * lambdas playground
 */
class BasicLambdaExamplesTest
{
    @Test
    void run()
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.forEach((Integer value) -> System.out.println(value));
        System.out.println("--");
        numbers.forEach(value -> System.out.println(value));
        System.out.println("--");
        numbers.forEach(System.out::println);
    }
}
