package com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Adapter is converter.
 * facets:
 * - patterns
 * - adapter
 */
class AdapterPatternExampleRunner
{
    @Test
    void run()
    {
        Indicator celsius = new CelsiusScaleThermometer();
        IndicatorAdapter indicatorAdapter = new IndicatorAdapterImpl(celsius);

        assertEquals(68.0, indicatorAdapter.getTemperature(), 0.0);
    }
}
