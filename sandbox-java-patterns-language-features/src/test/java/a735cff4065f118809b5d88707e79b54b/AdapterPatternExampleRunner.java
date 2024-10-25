package a735cff4065f118809b5d88707e79b54b;

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
