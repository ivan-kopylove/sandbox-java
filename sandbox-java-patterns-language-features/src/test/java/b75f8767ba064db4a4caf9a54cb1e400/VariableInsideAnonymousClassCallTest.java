package b75f8767ba064db4a4caf9a54cb1e400;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * How to call variable passed to an anonymous class
 */
class VariableInsideAnonymousClassCallTest
{
    @Test
    void test()
    {
        B b = new B()
        {
            @Override
            public void targetMethodToCall()
            {
                assertTrue(true);
            }
        };

        A a = new A()
        {
            //b field is created implicitly

            public void myMethod()
            {
                b.targetMethodToCall();
            }
        };

        Field[] a_fields = a.getClass()
                            .getDeclaredFields();
        Stream.of(a_fields)
              .filter(field -> B.class.isAssignableFrom(field.getType()))
              .forEach(field -> {
                  try
                  {
                      field.setAccessible(true);
                      ((B) field.get(a)).targetMethodToCall();
                  }
                  catch (Exception ex)
                  {
                      fail();
                  }
              });
    }
}