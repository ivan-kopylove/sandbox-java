package heap.afaae90f4bfff268e9ccdcf5f4eefb9fa;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringsTests
{
    @Test
    void test()
    {

        Stream.of(new MyObj("a"), new MyObj("b"))
              .peek(o -> {
                  if (true)
                  {
                      o.setDasjlkdas("");
                  }
              })
              .collect(Collectors.toList());


        Stream.of(new MyObj("a"), new MyObj("b"))
              .filter(obj -> {
                  return true;
              })
              .collect(Collectors.toList());
    }
}
