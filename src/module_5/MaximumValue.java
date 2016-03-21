package module_5;

public class MaximumValue {

    public int findMax(int [] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
