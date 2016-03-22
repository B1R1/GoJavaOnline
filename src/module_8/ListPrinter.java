package module_8;

import module_6.geometric_shapes.*;

import java.util.List;

public class ListPrinter {

    void print(List<Shape> list) {

        for (int i = 0; i < list.size(); i++)
        {
            if (((List) list).get(i) instanceof Circle)
            {
                System.out.println(((List) list).get(i) + " " + ((Circle) ((List) list).get(i)).getRadius());
            }
            else if (((List) list).get(i) instanceof Rectangle)
            {
                System.out.println(((List) list).get(i) + " " + ((Rectangle) ((List) list).get(i)).getHeight()
                        + " " + ((Rectangle) ((List) list).get(i)).getWidth());
            }
            else if (((List) list).get(i) instanceof Triangle)
            {
                System.out.println(((List) list).get(i) + " " + ((Triangle) ((List) list).get(i)).getHeight()
                        + " " + ((Triangle) ((List) list).get(i)).getBase());
            }
        }
    }
}