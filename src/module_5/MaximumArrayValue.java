package module_5;

public class MaximumArrayValue {
    public String findMaximumValue(int [] array)
    {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(maximum < array[i]){
                maximum = array[i];
            }
        }
        return "Maximum integer in array is: " + maximum;
    }
}
