package module_8;

import module_6.geometric_shapes.Circle;

import java.util.Iterator;
import java.util.Set;

public class SetPrinter {

    void print(Set<Circle> set) {

        Iterator iterator = set.iterator();

        while (iterator.hasNext())
        {
                System.out.println(iterator.next() + " "
                        + ((Circle) iterator.next()).getRadius());
            }
        }
    }