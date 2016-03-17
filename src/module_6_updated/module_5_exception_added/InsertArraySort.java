package module_6_updated.module_5_exception_added;

public class InsertArraySort implements ArraySort {

    @Override
    public int[] sortArray(int[] array) {
        int temp;
        int j;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }
}

