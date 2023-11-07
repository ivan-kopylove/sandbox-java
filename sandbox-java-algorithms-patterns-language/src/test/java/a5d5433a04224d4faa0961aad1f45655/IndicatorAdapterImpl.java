package a5d5433a04224d4faa0961aad1f45655;

public class IndicatorAdapterImpl implements IndicatorAdapter
{

    private final Indicator indicator;

    public IndicatorAdapterImpl(Indicator indicator)
    {
        this.indicator = indicator;
    }

    @Override
    public double getTemperature()
    {
        double temperature = indicator.getTemperature();
        return convert(temperature);
    }

    private double convert(double temperature)
    {
        return temperature * 1.8 + 32;
    }
}
