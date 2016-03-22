package module_8;

import module_6.geometric_shapes.*;

import java.util.List;

public class ListPrinter {

    void print(List<Shape> list)
    {
        for (Shape i : list)
        {
            if (i instanceof Circle)
            {
                System.out.printf(i + "%10.4s\n", ((Circle) i).getRadius());
            }
            else if (i instanceof Rectangle)
            {
                System.out.printf(i + "%7.4s%6.4s\n", ((Rectangle) i).getHeight(), ((Rectangle) i).getWidth());
            }
            else if (i instanceof Triangle)
            {
                System.out.printf(i +"%8.4s%6.4s\n", ((Triangle) i).getHeight(), ((Triangle) i).getBase());
            }
        }
    }
}