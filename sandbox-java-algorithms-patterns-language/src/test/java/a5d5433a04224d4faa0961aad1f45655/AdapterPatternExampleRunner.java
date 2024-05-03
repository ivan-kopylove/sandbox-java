package com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655;

import org.junit.jupiter.api.Test;

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
        com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655.Indicator celsius = new com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655.CelsiusScaleThermometer();
        com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655.IndicatorAdapter indicatorAdapter = new com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655.IndicatorAdapterImpl(celsius);

        assertEquals(68.0, indicatorAdapter.getTemperature(), 0.0);
    }
}
