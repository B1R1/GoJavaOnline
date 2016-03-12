package module_5;

public class FindMaximumValue {

    public String maximumValue (int [] array)
    {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(maximum < array[i])
            {
                maximum = array[i];
            }
        }
        return "Maximum integer is: " + maximum;
    }
}
