package module_8;

import module_6.geometric_shapes.Circle;

import java.util.Iterator;
import java.util.Set;

public class SetPrinter
{
    void print (Set <Circle> set)
    {
        for (Circle circle : set)
        {
            System.out.printf(circle + "%10.4s\n", circle.getRadius());
            }
        }
    }