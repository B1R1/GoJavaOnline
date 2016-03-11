package module_4.temperature_conversion;

public class CelsiusToFahrenheit {

    public double fromCelsiusToFahrenheit (TemperaturesValue celsiusValue)
    {
        return (celsiusValue.getCelsiusValue() - 32) * (5 / 9);
    }


}
