package module_8;

import module_6.geometric_shapes.*;

import java.util.*;

public class CollectionsCreator {

    public static List createList( List <Shape> list) {
        list.add(new Circle(2));
        list.add(new Triangle(5, 94));
        list.add(new Rectangle(7, 4));
        list.add(new Circle(2));
        list.add(new Triangle(3, 16));

        return list;
    }

    public static Set createSet(Set <Circle> set) {
        set.add(new Circle(2));
        set.add(new Circle(1));
        set.add(new Circle(4));
        set.add(new Circle(3));
        set.add(new Circle(6));
        set.add(new Circle(5));

        return set;
    }

    public static Map createMap(Map <Shape, Integer> map ) {
        map.put(new Circle(2), 17);
        map.put(new Triangle(2, 9), 6);
        map.put(new Circle(2), 4);
        map.put(new Circle(2), 90);
        map.put(new Rectangle(5, 2), 89);

        return map;
    }
}
