package com.github.ivan.kopylove.sandbox.patterns.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Decorator Pattern Example.
 *
 * 
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
