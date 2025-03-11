package heap.acaf073ad95f029042ea7071fd12917cf;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Reducer
{
    @Test
    void run1()
    {
        Optional<Integer> reduced = Stream.of(1, 2, 3)
                                          .reduce(new BinaryOperator<Integer>()
                                          {
                                              @Override
                                              public Integer apply(Integer previous, Integer current)
                                              {
                                                  return current > previous ? current : previous;
                                              }
                                          });
        assertTrue(reduced.isPresent());
        reduced.ifPresent(value -> assertEquals(Integer.valueOf(3), value));
    }

    @Test
    void run2()
    {
        Optional<Integer> reduced = Stream.of(1)
                                          .reduce(new BinaryOperator<Integer>()
                                          {
                                              @Override
                                              public Integer apply(Integer previous, Integer current)
                                              {
                                                  System.out.println("Called"); //not called for one element
                                                  return current > previous ? current : previous;
                                              }
                                          });
        assertTrue(reduced.isPresent());
        reduced.ifPresent(value -> assertEquals(Integer.valueOf(1), value));
    }
}
