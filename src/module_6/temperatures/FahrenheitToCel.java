package module_6.temperatures;

public class FahrenheitToCel {

    public double convert (Temperatures temp)
    {
        return  (temp.getFahrenheit()  * 1.8) + 32;
    }
}
