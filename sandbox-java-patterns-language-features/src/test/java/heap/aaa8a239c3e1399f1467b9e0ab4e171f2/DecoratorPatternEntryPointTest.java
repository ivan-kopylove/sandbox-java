package heap.aaa8a239c3e1399f1467b9e0ab4e171f2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Decorator Pattern Example.
 * facets:
 * - patterns
 * - decorator
 */
class DecoratorPatternEntryPointTest
{
    @Test
    void main()
    {
        Window decoratedWindow = new HorizontalScrollbarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        System.out.println(decoratedWindow.getDescription());
        assertEquals("simple window, including vertical scrollbars, including horizontal scrollbars",
                     decoratedWindow.getDescription());
    }
}
