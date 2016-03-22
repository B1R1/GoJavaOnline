package module_8;

import module_6.geometric_shapes.*;

import java.util.Map;

public class MapPrinter {

    void print(Map <Shape, Integer> map) {

        for (Map.Entry<Shape, Integer> pair : map.entrySet())
        {
            if (pair.getKey() instanceof Circle)
            {
                System.out.println(pair.getKey() + " " + ((Circle) pair.getKey()).getRadius());
            }
            else if (pair.getKey() instanceof Rectangle)
            {
                System.out.println(pair.getKey() + " " + ((Rectangle) pair.getKey()).getHeight() +
                        " " + ((Rectangle) pair.getKey()).getWidth());
            }
            else if (pair.getKey() instanceof Triangle)
            {
                System.out.println(pair.getKey() + " " + ((Triangle) pair.getKey()).getHeight() +
                        " " + ((Triangle) pair.getKey()).getBase());
            }
        }
    }
}