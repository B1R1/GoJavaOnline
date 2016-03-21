package module_6_updated.module_5_exception_added;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Домашнее задание к Модулю 6.
 1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
 При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */
public class Main {

    private static int arraySize = 0;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, print size of array: from 2 to 100.");

        int[] arrayOfIntegers = null;
        try {
            arraySize = Integer.parseInt(reader.readLine());
            arrayOfIntegers = new int[arraySize];

            System.out.print("Print unsorted array: ");

            for (int i = 0; i < arrayOfIntegers.length; i++) {
                int defaultValue = (int) (Math.random() * 50);
                arrayOfIntegers[i] = defaultValue;
                System.out.print(arrayOfIntegers[i] + " ");
            }
            System.out.println();

        } catch (NumberFormatException nfe) {
            System.out.println("ERROR: You had to print number.");
        } catch (IOException e) {
            System.out.println("Failed or interrupted I/O operations.");
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("ERROR: Failed close thread operation");
            }
        }

        MaximumArrayValue findMax = new MaximumArrayValue();
        String maximum = null;
        try {
            maximum = findMax.findMaximumValue(arrayOfIntegers);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An array has been accessed with an illegal index.");
        }

        MinimumArrayValue findMin = new MinimumArrayValue();
        String minimum = null;
        try {
            minimum = findMin.findMinimumValue(arrayOfIntegers);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An array has been accessed with an illegal index.");
        }

        System.out.println(maximum);
        System.out.println(minimum);

        ArraySort insertSort = new InsertArraySort();

        int[] sortedArray = insertSort.sort(arrayOfIntegers);

        ArraySort bubbleSort = new BubbleArraySort();
        bubbleSort.sort(arrayOfIntegers);

        System.out.print("Print sorted array: ");
        for (int arrayOfInteger : sortedArray) {
            System.out.print(arrayOfInteger + " ");

        }
    }
}
