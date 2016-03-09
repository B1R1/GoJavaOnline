package module_4.temperatureConversion;

public class CelsiusToFahrenheit {

    public double fromCelsiusToFahrenheit (TemperaturesData celsiusValue)
    {
        return (celsiusValue.getCelsiusValue() - 32) * (5 / 9);
    }


}
