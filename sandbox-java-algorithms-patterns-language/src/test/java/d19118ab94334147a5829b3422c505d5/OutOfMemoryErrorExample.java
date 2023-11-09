package d19118ab94334147a5829b3422c505d5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class OutOfMemoryErrorExample
{
    @Test
    void ucommentMe()
    {

        assertThrows(OutOfMemoryError.class, () -> {
            //        List<String> list = new ArrayList<>();
            //        for (long i = 0; i < 1_000_000_000; i++)
            //        {
            //            list.add(String.valueOf(i));
            //        }
        });
    }
}
