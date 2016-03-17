package module_6_updated.module_4_exception_added.temperature_conversion;

public class CelsiusToFahrenheit {

    public double fromCelsiusToFahrenheit (TemperaturesValue celsiusValue)
    {
        return (celsiusValue.getCelsiusValue() - 32) * (5 / 9);
    }


}
