package javaenterprise.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsTesterRunner {

    public long[] testArrayList(int size) {
        long[] result = new long[7];
        result[0] = CollectionsTester.testAddMethod(new ArrayList<>(), size);
        result[1] = CollectionsTester.testGetMethod(new ArrayList<>(), size);
        result[2] = CollectionsTester.testRemoveMethod(new ArrayList<>(), size);
        result[3] = CollectionsTester.testContainsMethod(new ArrayList<>(), size);
        result[4] = CollectionsTester.testPopulateMethod(new ArrayList<>(), size);
        result[5] = CollectionsTester.testIteratorAddMethod(new ArrayList<>(), size);
        result[6] = CollectionsTester.testIteratorRemoveMethod(new ArrayList<>(), size);
        return result;
    }

    public long[] testLinkedList(int size) {
        long[] result = new long[7];
        result[0] = CollectionsTester.testAddMethod(new LinkedList<>(), size);
        result[1] = CollectionsTester.testGetMethod(new LinkedList<>(), size);
        result[2] = CollectionsTester.testRemoveMethod(new LinkedList<>(), size);
        result[3] = CollectionsTester.testContainsMethod(new LinkedList<>(), size);
        result[4] = CollectionsTester.testPopulateMethod(new LinkedList<>(), size);
        result[5] = CollectionsTester.testIteratorAddMethod(new LinkedList<>(), size);
        result[6] = CollectionsTester.testIteratorRemoveMethod(new LinkedList<>(), size);
        return result;
    }

    public long[] testHashSet(int size) {
        long[] result = new long[4];
        result[0] = CollectionsTester.testAddMethod(new HashSet<>(), size);
        result[1] = CollectionsTester.testRemoveMethod(new HashSet<>(), size);
        result[2] = CollectionsTester.testContainsMethod(new HashSet<>(), size);
        result[3] = CollectionsTester.testPopulateMethod(new HashSet<>(), size);
        return result;
    }

    public long[] testTreeSet(int size) {
        long[] result = new long[4];
        result[0] = CollectionsTester.testAddMethod(new TreeSet<>(), size);
        result[1] = CollectionsTester.testRemoveMethod(new TreeSet<>(), size);
        result[2] = CollectionsTester.testContainsMethod(new TreeSet<>(), size);
        result[3] = CollectionsTester.testPopulateMethod(new TreeSet<>(), size);
        return result;
    }
}
