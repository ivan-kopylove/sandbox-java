package heap.a735cff4065f118809b5d88707e79b54b;

class IndicatorAdapterImpl implements IndicatorAdapter
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
