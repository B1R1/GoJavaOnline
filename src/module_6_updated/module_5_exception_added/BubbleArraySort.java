package module_6_updated.module_5_exception_added;

public class BubbleArraySort implements ArraySort {

    @Override
    public int[] sortArray(int[] array) {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } return array;
    }
}

