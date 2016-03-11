package module_4.temperature_conversion;

public class FahrenheitToCelsius {

    public double fromFahrenheitToCelsius (TemperaturesData fahrenheitValue)
    {
        return  (fahrenheitValue.getFahrenheitValue()  * 1.8) + 32;
    }
}
