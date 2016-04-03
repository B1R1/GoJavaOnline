package module6.array_sort;
/**
 Домашнее задание к Модулю 5.
 Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
 Выбрать один из алгоритмов сортировки массивов и реализовать его.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int[] array = fillArray();

        int maximum = findMax(array);
        System.out.println("\nMaximum: " + maximum);

        int minimum = findMin(array);
        System.out.println("Minimum: " + minimum);

        sortInsert(array);

        sortBubble(array);
    }

    private static void sortBubble(int[] array) {
        ArraySort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
    }

    private static void sortInsert(int[] array) {
        ArraySort insertSort = new InsertSort();
        insertSort.sort(array);
    }

    private static int findMax(int[] array) {
        MaxValue findMax = new MaxValue();
        int maximum = 0;
        try {
            maximum = findMax.findMax(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: An array has been accessed with an illegal index.");
        }
        return maximum;
    }

    private static int findMin(int[] array) {
        MinValue findMin = new MinValue();
        int minimum = 0;
        try {
            minimum = findMin.findMin(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: An array has been accessed with an illegal index.");
        }
        return minimum;
    }

    private static int[] fillArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = 0;
        try {
            arraySize = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error: Failed or interrupted I/O operations.");
        }

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            int defaultValue = (int) (Math.random() * 50);
            array[i] = defaultValue;
            System.out.print(array[i] + " ");
        }
        return array;
    }
}