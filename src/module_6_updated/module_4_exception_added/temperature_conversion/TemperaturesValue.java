package module_6_updated.module_4_exception_added.temperature_conversion;

public class TemperaturesValue {
    private double fahrenheitValue;
    private double celsiusValue;

    public TemperaturesValue(double fahrenheitValue, double celsiusValue) {
        this.fahrenheitValue = fahrenheitValue;
        this.celsiusValue = celsiusValue;
    }

    public double getFahrenheitValue() {
        return fahrenheitValue;
    }

    public void setFahrenheitValue(double fahrenheitValue) {
        this.fahrenheitValue = fahrenheitValue;
    }

    public double getCelsiusValue() {
        return celsiusValue;
    }

    public void setCelsiusValue(double celsiusValue) {
        this.celsiusValue = celsiusValue;
    }
}
