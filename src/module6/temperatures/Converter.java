package module6.temperatures;

class Converter {

    private static final double FORMULA_FOR_CELSIUS = 5/9;
    private static final double FORMULA_FOR_FAHRENHEIT = 1.8;

    public double convertCelsiusToFah(Temperatures temp) {
        return (temp.getCelsius() - 32) * (FORMULA_FOR_CELSIUS);
    }

    public double convertFahrenheitToCel(Temperatures temp) {
        return  (temp.getFahrenheit()  * FORMULA_FOR_FAHRENHEIT) + 32;
    }
}
