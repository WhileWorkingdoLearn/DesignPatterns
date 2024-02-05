package org.example.StructuralPattern.Adapter;

public class FahrenheitAdapter extends CelsiusThermometer implements TempAdapter {

    private final CelsiusThermometer celsiusThermometer;
    public FahrenheitAdapter(CelsiusThermometer celsiusThermometer){
        this.celsiusThermometer = celsiusThermometer;
    }

    @Override
    public float getFahrenheit() {
        return (this.getCelsius() * (float) 1.8 ) + 32;
    }
}
