package module_8;
/**
 Домашнее задание к Модулю 8
 Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций объектов из данной иерархии.
 Хотя бы одна коллекция должна содержать в себе объекты разных классов.
 Создать класс, который печатает созданные коллекции на экран в виде таблицы. Колонки таблицы соответствуют полям объектов.
 Каждая строка в таблице соответствует объекту из коллекции.
 Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().
 */

import module_6.module_4_exception_added.areas_of_geometric_shapes.Circle;
import module_6.module_4_exception_added.areas_of_geometric_shapes.Rectangle;
import module_6.module_4_exception_added.areas_of_geometric_shapes.Shape;
import module_6.module_4_exception_added.areas_of_geometric_shapes.Triangle;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Shape> listShapes = new ArrayList<>();
        createList(listShapes);

        createSet();

        createMap();

        createTreeSet();  //Создаю упорядоченный список

        PrintCollections toPrint = new PrintCollections();
        toPrint.print(listShapes);
    }

    private static List createList(List list) {
        for (int i = 0; i < (Math.random() * 10); i++) {
            list.add(new Circle(22));
            list.add(new Triangle(22, 44));
            list.add(new Rectangle(22, 44));
        }
        return list;
    }

    private static void createSet() {
        Set<Shape> set = new HashSet<Shape>();
        for (int i = 0; i < 5; i++) {
            set.add(new Circle(2));
            set.add(new Triangle(2, 4));
            set.add(new Rectangle(6, 8));
        }
    }

    private static void createMap() {
        Map<Shape, Integer> map = new HashMap<Shape, Integer>();
        map.put(new Circle(2), 17);
        map.put(new Triangle(2, 9), 6);
        map.put(new Circle(2), 4);
        map.put(new Circle(2), 90);
        map.put(new Rectangle(5, 2), 89);
    }

    private static void createTreeSet() {
        Set<Shape> treeSet = new TreeSet<Shape>();
        treeSet.add(new Circle(1));
        treeSet.add(new Triangle(2, 4));
        treeSet.add(new Rectangle(12, 2));
    }
}
