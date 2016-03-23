package module_8;

import module_6.geometric_shapes.*;

import java.util.*;

public class Creator
{
    public static List createList (List <Shape> list)
    {
        list.add(new Circle(2));
        list.add(new Triangle(5, 94));
        list.add(new Rectangle(7, 4));

        return list;
    }

    public static Set createSet (Set <Shape> set)
    {
        set.add(new Circle(2));
        set.add(new Circle(1));
        set.add(new Circle(3));

        return set;
    }

    public static Map createMap (Map <Shape, Integer> map)
    {
        map.put(new Circle(2), 0);
        map.put(new Triangle(2, 9), 0);
        map.put(new Rectangle(5, 2), 0);

        return map;
    }
}
