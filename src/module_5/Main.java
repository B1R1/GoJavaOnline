package module_5;
/**
 Домашнее задание к Модулю 5.
 Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
 Выбрать один из алгоритмов сортировки массивов и реализовать его.
 */
public class Main {

    private static final int arraySize = 15;

    public static void main(String[] args) {

        int[] arrayOfIntegers = fillArray();

        int maximum = findMax(arrayOfIntegers);

        int minimum = findMin(arrayOfIntegers);

        sortInsert(arrayOfIntegers);

        sortBubble(arrayOfIntegers);
    }

    private static void sortBubble(int[] arrayOfIntegers) {
        ArraySort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayOfIntegers);
    }

    private static void sortInsert(int[] arrayOfIntegers) {
        ArraySort insertSort = new InsertSort();
        insertSort.sort(arrayOfIntegers);
    }

    private static int findMax(int[] arrayOfIntegers) {
        MaximumValue findMax = new MaximumValue();
        return findMax.findMax(arrayOfIntegers);
    }

    private static int findMin(int[] arrayOfIntegers) {
        MinimumValue findMin = new MinimumValue();
        return findMin.findMinim(arrayOfIntegers);
    }

    private static int[] fillArray() {
        int[] arrayOfIntegers = new int[arraySize];

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int defaultValue = (int) (Math.random() * 50);
            arrayOfIntegers[i] = defaultValue;
            System.out.print(arrayOfIntegers[i] + " ");
        }
        return arrayOfIntegers;
    }
}
