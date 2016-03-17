package module_6_updated.module_4_exception_added.temperature_conversion;

public class FahrenheitToCelsius {

    public double fromFahrenheitToCelsius (TemperaturesValue fahrenheitValue)
    {
        return  (fahrenheitValue.getFahrenheitValue()  * 1.8) + 32;
    }
}
