package module_6.module_4_exception_added.temperature_conversion;

public class FahrenheitToCel {

    public double convert (Temperatures temp)
    {
        return  (temp.getFahrenheit()  * 1.8) + 32;
    }
}
