package javacore.module8;
/**
 Домашнее задание к Модулю 8
 Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
 Хотя бы одна коллекция должна содержать в себе объекты разных классов.
 Создать класс, который печатает созданные коллекции на экран в виде таблицы. Колонки таблицы соответствуют
 полям объектов.
 Каждая строка в таблице соответствует объекту из коллекции.
 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().
 */

import javacore.module6.geometric_shapes.NegativeValueException;
import javacore.module6.geometric_shapes.Shape;

import java.util.*;

public class Main {

    public static void main(String[] args) throws NegativeValueException {

        List<Shape> list = new ArrayList<>();
        Creator.createList(list);

        Map<Shape, Integer> map = new HashMap<>();
        Creator.createMap(map);

        Set<Shape> set = new TreeSet<>();
        Creator.createSet(set);

        print(list);

        print(set);

        printMap(map);

        bubbleSort(list);

        print(list);
    }

    private static void print(Collection<Shape> collection) {
        String collectionName = collection.getClass().getSimpleName();
        System.out.println("\nPrint " + collectionName);
        CollectionPrinter.print(collection);
    }

    private static void printMap(Map<Shape, Integer> map) {
        MapPrinter printer = new MapPrinter();
        System.out.println("\nPrint map ");
        printer.print(map);
    }

    private static void bubbleSort(List<Shape> list) throws NegativeValueException {
        ListBubbleSort sorter = new ListBubbleSort();
        sorter.sort(list);
    }
}

