package module_4.temperature_conversion;

public class CelsiusToFahrenheit {

    public double fromCelsiusToFahrenheit (TemperaturesData celsiusValue)
    {
        return (celsiusValue.getCelsiusValue() - 32) * (5 / 9);
    }


}
