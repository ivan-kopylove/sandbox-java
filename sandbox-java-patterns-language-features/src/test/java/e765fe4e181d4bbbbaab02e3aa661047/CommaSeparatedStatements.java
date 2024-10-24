package e765fe4e181d4bbbbaab02e3aa661047;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommaSeparatedStatements
{
    @Test
    void validSyntax()
    {
        float foo = 2, bar = 3, baz = 4;//1//
        float mod1 = foo % baz, mod2 = baz % foo;  //2
        float result = mod1 > mod2 ? bar : baz; //3
        //        assertEquals(, result); //calculate yourself
    }

    @Test
    void assignmentInsideExpression()
    {
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;

        int i4 = i1 + (i2 = i3);
        assertEquals(4, i4);
    }

    @Test
    void evalInsideSwitch()
    {
        {
            char[] ca = {'a', 'b', 'c', 'd'};
            int i = 0;
            for (char c : ca)
            {
                switch (c)
                {
                    case 'a':
                        i++;
                    case 'b':
                        ++i;
                    case 'c' | 'd':
                        i++;
                }
            }
            assertEquals(5, i);
        }
    }
}
