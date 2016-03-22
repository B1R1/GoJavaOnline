package module_6.temperatures;

public class CelsiusToFahr {

    public double convert(Temperatures temp)
    {
        return (temp.getCelsius() - 32) * (5 / 9);
    }


}
