package module_5;

public class MinimumValue {

    public int findMinim (int [] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
