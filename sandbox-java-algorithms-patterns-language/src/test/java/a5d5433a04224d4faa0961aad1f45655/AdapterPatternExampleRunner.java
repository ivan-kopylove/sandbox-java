package a5d5433a04224d4faa0961aad1f45655;

import org.junit.jupiter.api.Assertions;
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
        Indicator celsius = new CelsiusScaleThermometer();
        IndicatorAdapter indicatorAdapter = new IndicatorAdapterImpl(celsius);

        Assertions.assertEquals(68.0, indicatorAdapter.getTemperature(), 0.0);
    }
}
