package javacore.module8;

import javacore.module6.geometric_shapes.Circle;
import javacore.module6.geometric_shapes.Rectangle;
import javacore.module6.geometric_shapes.Shape;
import javacore.module6.geometric_shapes.Triangle;

import java.util.Collection;

class CollectionPrinter {

    public static void print(Collection<Shape> collection) {
        for (Shape i : collection) {
            if (i instanceof Circle) {
                System.out.printf(i + "%10.4s\n", ((Circle) i).getRadius());
            } else if (i instanceof Rectangle) {
                System.out.printf(i + "%7.4s%6.4s\n", ((Rectangle) i).getHeight(), ((Rectangle) i).getWidth());
            } else if (i instanceof Triangle) {
                System.out.printf(i +"%8.4s%6.4s\n", ((Triangle) i).getHeight(), ((Triangle) i).getBase());
            }
        }
    }
}