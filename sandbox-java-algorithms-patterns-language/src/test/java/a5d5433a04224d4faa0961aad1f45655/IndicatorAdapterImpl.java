package com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655;

class IndicatorAdapterImpl implements com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655.IndicatorAdapter
{

    private final com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655.Indicator indicator;

    public IndicatorAdapterImpl(com.github.ivan.kopylove.challenges.a5d5433a04224d4faa0961aad1f45655.Indicator indicator)
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
