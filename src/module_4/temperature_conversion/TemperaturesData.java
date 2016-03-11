package module_4.temperature_conversion;

public class TemperaturesData {
    private double fahrenheitValue;
    private double celsiusValue;

    public TemperaturesData(double fahrenheitValue, double celsiusValue) {
        this.fahrenheitValue = fahrenheitValue;
        this.celsiusValue = celsiusValue;
    }

    // getters and setters

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
