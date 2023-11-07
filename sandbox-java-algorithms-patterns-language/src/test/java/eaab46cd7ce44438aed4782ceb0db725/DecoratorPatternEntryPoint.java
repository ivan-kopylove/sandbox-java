package eaab46cd7ce44438aed4782ceb0db725;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Decorator Pattern Example.
 * facets:
 * - patterns
 * - decorator
 */
public class DecoratorPatternEntryPoint
{
    @Test
    public void main()
    {
        Window decoratedWindow = new HorizontalScrollbarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        System.out.println(decoratedWindow.getDescription());
        Assertions.assertEquals("simple window, including vertical scrollbars, including horizontal scrollbars",
                                decoratedWindow.getDescription());
    }
}
