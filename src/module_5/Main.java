package module_5;
/**
 Домашнее задание к Модулю 5.
 Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
 Выбрать один из алгоритмов сортировки массивов и реализовать его.
 */
public class Main {
    private static final int arraySize = 15;
    public static void main(String[] args) {

        int[] arrayOfIntegers = new int[arraySize];
        System.out.print("Print unsorted array: ");

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int defaultValue = (int) (Math.random() * 50);
            arrayOfIntegers[i] = defaultValue;
            System.out.print(arrayOfIntegers[i] + " ");
        }
        System.out.println();

        MaximumArrayValue findMax = new MaximumArrayValue();
        String maximum = findMax.findMaximumValue(arrayOfIntegers);

        MinimumArrayValue findMin = new MinimumArrayValue();
        String minimum = findMin.findMinimumValue(arrayOfIntegers);

        System.out.println(maximum);
        System.out.println(minimum);

        ArraySort insertSort = new InsertArraySort();
        insertSort.sortArray(arrayOfIntegers);

        ArraySort bubbleSort = new BubbleArraySort();
        bubbleSort.sortArray(arrayOfIntegers);

        System.out.print("Print sorted array: ");
        for (int arrayOfInteger : arrayOfIntegers) {
            System.out.print(arrayOfInteger + " ");
        }
    }
}
