package com.github.ivan.kopylove.sandbox.patterns.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Adapter is converter.
 */
public class AdapterPatternExampleRunner
{
    @Test
    public void run()
    {
        Indicator celsius = new CelsiusScaleThermometer();
        IndicatorAdapter indicatorAdapter = new IndicatorAdapterImpl(celsius);

        Assertions.assertEquals(68.0, indicatorAdapter.getTemperature(), 0.0);
    }
}
