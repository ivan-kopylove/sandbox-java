package heap.a01bc67fdef1bebc1ac94950d09126f6b;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * The term "unchecked" refers to the fact that the compiler and the runtime system do not have enough type information to perform all type checks that would be necessary to ensure type safety.
 * In this sense, certain operations are "unchecked".
 */
class UncheckedGenericWarningExample
{
    @Test
    void main()
    {
        List list = new ArrayList();
        list.add("String"); // unchecked warning
        list.add(1); // unchecked warning
    }
}
