package heap.acaf073ad95f029042ea7071fd12917cf;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Purpose of this example: to show that it is not safe to get stream from null object
 */
class StreamsNullSafetyTest
{
    @Test
    void run()
    {
        assertThrows(NullPointerException.class, () -> {

            List<String> myList = null;
            myList.stream()
                  .forEach(System.out::println);
        });
    }
}
