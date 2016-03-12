package module_5;

public class FindMinimumValue {

    public String minimumValue (int [] array)
    {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(minimum > array[i])
            {
                minimum = array[i];
            }
        }
        return "Minimum integer is: " + minimum;
    }
}
