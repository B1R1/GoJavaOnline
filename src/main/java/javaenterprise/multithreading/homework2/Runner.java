package javaenterprise.multithreading.homework2;

public class Runner {

    public static final int ARRAY_SIZE = 1000;
    public static final int NUMBER_OF_THREADS = 5;

    public static void main(String[] args) {
        Executors executor = new Executors();

        int[] array = getArray();

        System.out.println("\nFinal result "
                + executor.getSquareSum(array, NUMBER_OF_THREADS));
    }

    private static int[] getArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i;
        }
        return array;
    }
}
