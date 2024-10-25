package afbd657642c5963d5d1d83ff11e99064c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Double
{
    @Test
    void run1()
    {
        double d1 = 1.0;
        double d2 = 43e1;//scientific notation
        double d3 = 43e2;//scientific notation

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        assertEquals(1.0, d1, 0);
        assertEquals(430, d2, 0);
        assertEquals(4300, d3, 0);
    }

    @Test
    void implicit_narrowing()
    {
        float f1 = 1.0f;
        double d1 = f1;

        assertEquals(f1, d1, 0);
    }
}
