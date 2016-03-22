package module_8;
/**
 Домашнее задание к Модулю 8
 Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
 Хотя бы одна коллекция должна содержать в себе объекты разных классов.
 Создать класс, который печатает созданные коллекции на экран в виде таблицы. Колонки таблицы соответствуют
 полям объектов.
 Каждая строка в таблице соответствует объекту из коллекции.
 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().
 */

import module_6.geometric_shapes.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws NegativeValueException {

        List<Shape> list = new ArrayList<>();
        CollectionsCreator.createList(list);

        Map<Shape, Integer> map = new HashMap<>();
        CollectionsCreator.createMap(map);

        Set<Circle> set = new TreeSet<>();
        CollectionsCreator.createSet(set);

        ListPrinter printerList = getListPrinter(list);

        getLisSortedAndPrinted(list, printerList); // сортирую ArrayList

        getSetPrinter(set);

        getMapPrinter(map);
    }

    private static void getMapPrinter(Map<Shape, Integer> map) {
        MapPrinter printerMap = new MapPrinter();

        System.out.println("\nPrint map: \n");

        printerMap.print(map);
    }

    private static void getSetPrinter(Set<Circle> treeSet) {
        SetPrinter printerSet = new SetPrinter();

        System.out.println("\nPrint treeSet: \n");

        printerSet.print(treeSet);
    }

    private static void getLisSortedAndPrinted(List<Shape> list, ListPrinter printerList) throws NegativeValueException {
        ListSorter sorter = new ListSorter();

        sorter.sort(list);

        System.out.println("\nPrint sorted list: \n");

        printerList.print(list);
    }

    private static ListPrinter getListPrinter(List<Shape> list) {
        ListPrinter printerList = new ListPrinter();

        System.out.println("Print list: \n");

        printerList.print(list);

        return printerList;
    }

    }

