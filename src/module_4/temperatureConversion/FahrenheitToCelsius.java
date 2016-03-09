package module_4.temperatureConversion;

public class FahrenheitToCelsius {

    public double fromFahrenheitToCelsius (TemperaturesData fahrenheitValue)
    {
        return  (fahrenheitValue.getFahrenheitValue()  * 1.8) + 32;
    }
}
