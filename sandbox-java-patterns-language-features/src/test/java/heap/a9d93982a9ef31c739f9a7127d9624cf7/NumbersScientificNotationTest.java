package heap.a9d93982a9ef31c739f9a7127d9624cf7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersScientificNotationTest
{

    @Test
    void scientificNotation()
    {

        //        int x = 10e1; //uncompilable
        //        float x = 10e1; //uncompilable

        double a1 = 10e1;
        double a2 = 10e01f;

        double a3 = 15e1f;
        double a4 = 15.5e1f;

        double a5 = 15.5e-0f;
        double a6 = 15.5e-1f;

        assertEquals(100.0, a1, 0);
        assertEquals(100.0, a2, 0);
        assertEquals(150.0, a3, 0);
        assertEquals(155.0, a4, 0);
        assertEquals(15.5, a5, 0);
        assertEquals(1.55, a6, 0.0000001);
    }
}
