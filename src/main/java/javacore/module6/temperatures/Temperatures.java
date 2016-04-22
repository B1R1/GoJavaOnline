package javacore.module6.temperatures;

class Temperatures {
    private double fahrenheit;
    private double celsius;

    public Temperatures(double fahrenheit, double celsius) {
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
