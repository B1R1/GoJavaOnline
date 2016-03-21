package module_6.module_4_exception_added.temperature_conversion;

public class CelsiusToFahr {

    public double convert(Temperatures temp)
    {
        return (temp.getCelsius() - 32) * (5 / 9);
    }


}
