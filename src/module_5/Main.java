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
        System.out.print("Printing unsorted array: ");
        // init array
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int defaultValue = (int) (Math.random() * 50);
            arrayOfIntegers[i] = defaultValue;
            System.out.print(arrayOfIntegers[i] + " ");
        }
        System.out.println();

        // find minimum and maximum
        FindMaximumValue findMax = new FindMaximumValue();
        String maximum = findMax.maximumValue(arrayOfIntegers);

        FindMinimumValue findMin = new FindMinimumValue();
        String minimum  =findMin.minimumValue(arrayOfIntegers);

        System.out.println(maximum);
        System.out.println(minimum);

        // sort array
        SortArray sort = new SortArray();
        sort.sortArray(arrayOfIntegers);
        System.out.print("Printing sorted array: ");

        for (int arrayOfInteger : arrayOfIntegers) {
            System.out.print(arrayOfInteger + " ");
        }
    }
}
