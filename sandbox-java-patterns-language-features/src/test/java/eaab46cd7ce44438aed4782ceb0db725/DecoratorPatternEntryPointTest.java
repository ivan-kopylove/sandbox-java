package com.github.ivan.kopylove.challenges.eaab46cd7ce44438aed4782ceb0db725;

import org.junit.jupiter.api.Test;

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
        Window decoratedWindow = new com.github.ivan.kopylove.challenges.eaab46cd7ce44438aed4782ceb0db725.HorizontalScrollbarDecorator(new com.github.ivan.kopylove.challenges.eaab46cd7ce44438aed4782ceb0db725.VerticalScrollBarDecorator(new com.github.ivan.kopylove.challenges.eaab46cd7ce44438aed4782ceb0db725.SimpleWindow()));
        System.out.println(decoratedWindow.getDescription());
        assertEquals("simple window, including vertical scrollbars, including horizontal scrollbars",
                     decoratedWindow.getDescription());
    }
}
