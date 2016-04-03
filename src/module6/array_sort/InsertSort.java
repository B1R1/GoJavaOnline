package module6.array_sort;

public class InsertSort implements ArraySort {

    @Override
    public int[] sort(int[] array) {
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

