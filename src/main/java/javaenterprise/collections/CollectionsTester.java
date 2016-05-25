package javaenterprise.collections;

import java.util.*;

public class CollectionsTester {

    private static final int ATTEMPTS = 100;

    public static long testAddMethod(Collection <Integer> col, int amountOfElements) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < ATTEMPTS; i++) {
            times.add(calculateAddMethodTime(col, amountOfElements));
        }
        long sum = 0;
        for (Long index : times) {
            sum += index;
        }
        return sum / ATTEMPTS;
    }

    public static long testGetMethod(List <Integer> col, int amountOfElements) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < ATTEMPTS; i++) {
            times.add(calculateGetMethodTime(col, amountOfElements));
        }
        long sum = 0;
        for (Long index : times) {
            sum += index;
        }
        return sum / ATTEMPTS;
    }

    public static long testRemoveMethod(Collection <Integer> col, int amountOfElements) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < ATTEMPTS; i++) {
            times.add(calculateRemoveMethodTime(col, amountOfElements));
        }
        long sum = 0;
        for (Long index : times) {
            sum += index;
        }
        return sum / ATTEMPTS;
    }

    public static long testContainsMethod(Collection <Integer> col, int amountOfElements) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < ATTEMPTS; i++) {
            times.add(calculateContainsMethodTime(col, amountOfElements));
        }
        long sum = 0;
        for (Long index : times) {
            sum += index;
        }
        return sum / ATTEMPTS;
    }

    public static long testPopulateMethod(Collection <Integer> col, int amountOfElements) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < ATTEMPTS; i++) {
            times.add(calculatePopulateMethodTime(col, amountOfElements));
        }
        long sum = 0;
        for (Long index : times) {
            sum += index;
        }
        return sum / ATTEMPTS;
    }

    public static long testIteratorAddMethod(List <Integer> col, int amountOfElements) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < ATTEMPTS; i++) {
            times.add(calculateIteratorAddMethodTime(col, amountOfElements));
        }
        long sum = 0;
        for (Long index : times) {
            sum += index;
        }
        return sum / ATTEMPTS;
    }

    public static long testIteratorRemoveMethod(List <Integer> col, int amountOfElements) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < ATTEMPTS; i++) {
            times.add(calculateIteratorRemoveMethodTime(col, amountOfElements));
        }
        long sum = 0;
        for (Long index : times) {
            sum += index;
        }
        return sum / ATTEMPTS;
    }


    private static long calculateAddMethodTime(Collection<Integer>col, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            col.add(i);
        }
        long startTime = System.currentTimeMillis();
        col.add(amountOfElements);
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

    private static long calculateGetMethodTime(List<Integer> col, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            col.add(i);
        }
        long startTime = System.currentTimeMillis();
        col.get(amountOfElements / 2);
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

    private static long calculateRemoveMethodTime(Collection<Integer>col, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            col.add(i);
        }
        long startTime = System.currentTimeMillis();
        col.remove(col.size() / 2);
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

    private static long calculateContainsMethodTime(Collection<Integer>col, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            col.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < amountOfElements-1; i++) {
            col.contains(i);
        }
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

    private static long calculatePopulateMethodTime(Collection<Integer> col, int amountOfElements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < amountOfElements; i++) {
            col.add(i);
        }
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

    private static long calculateIteratorAddMethodTime(List<Integer> col, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            col.add(i);
        }
        ListIterator<Integer> it = col.listIterator();
        long startTime = System.currentTimeMillis();
        it.add(amountOfElements);
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

    private static long calculateIteratorRemoveMethodTime(List<Integer> col, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            col.add(i);
        }
        ListIterator<Integer> it = col.listIterator();
        long startTime = System.currentTimeMillis();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }
}
