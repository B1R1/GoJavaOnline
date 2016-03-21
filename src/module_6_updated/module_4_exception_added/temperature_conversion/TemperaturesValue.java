package module_6_updated.module_4_exception_added.temperature_conversion;

public class TemperaturesValue {
    private double fahrenheit;
    private double celsius;

    public TemperaturesValue(double fahrenheit, double celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(final double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(final double celsius) {
        this.celsius = celsius;
    }
}
