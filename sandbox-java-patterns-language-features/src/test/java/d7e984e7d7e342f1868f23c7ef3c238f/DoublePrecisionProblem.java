package d7e984e7d7e342f1868f23c7ef3c238f;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoublePrecisionProblem
{
    @Test
    void a()
    {
        for (float value = 0.0f; value < 1.0f; value += 0.1f)
        {
            System.out.println(value);
        }
    }

    @Test
    void b()
    {
        double d = 0.3;
        double result = d * 3;
        System.out.println(result);
        assertEquals(0.8999999999999999, result, 0);
    }
}
