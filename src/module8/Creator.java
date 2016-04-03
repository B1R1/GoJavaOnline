package module8;

import module6.geometric_shapes.*;

import java.util.*;

class Creator {
    public static void createList (List <Shape> list) {
        list.add(new Circle(2));
        list.add(new Triangle(5, 94));
        list.add(new Rectangle(7, 4));
    }

    public static void createSet (Set <Shape> set) {
        set.add(new Circle(2));
        set.add(new Circle(1));
        set.add(new Circle(3));
    }

    public static void createMap (Map <Shape, Integer> map) {
        map.put(new Circle(2), 0);
        map.put(new Triangle(2, 9), 0);
        map.put(new Rectangle(5, 2), 0);
    }
}
