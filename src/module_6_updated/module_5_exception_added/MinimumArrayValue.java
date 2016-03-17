package module_6_updated.module_5_exception_added;

public class MinimumArrayValue {
    public String findMinimumValue(int [] array)
    {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(minimum > array[i]) {
                minimum = array[i];
            }
        }
        return "Minimum integer in array is: " + minimum;
    }
}
