package module_6.module_5_exception_added;

import module_5.ArraySort;
import module_5.BubbleSort;
import module_5.InsertSort;
import module_5.MaximumValue;
import module_5.MinimumValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Домашнее задание к Модулю 5.
 Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
 Выбрать один из алгоритмов сортировки массивов и реализовать его.
 */
public class Main {

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
        int maximum = 0;
        try {
            maximum = findMax.findMax(arrayOfIntegers);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: An array has been accessed with an illegal index.");
        }
        return maximum;
    }

    private static int findMin(int[] arrayOfIntegers) {
        MinimumValue findMin = new MinimumValue();
        int minimum = 0;
        try {
            minimum = findMin.findMinim(arrayOfIntegers);
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

        int[] arrayOfIntegers = new int[arraySize];

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int defaultValue = (int) (Math.random() * 50);
            arrayOfIntegers[i] = defaultValue;
            System.out.print(arrayOfIntegers[i] + " ");
        }
        return arrayOfIntegers;
    }
}
