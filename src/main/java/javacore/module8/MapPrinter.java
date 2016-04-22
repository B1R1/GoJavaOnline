package javacore.module8;

import javacore.module6.geometric_shapes.Circle;
import javacore.module6.geometric_shapes.Rectangle;
import javacore.module6.geometric_shapes.Shape;
import javacore.module6.geometric_shapes.Triangle;

import java.util.Map;

class MapPrinter {

    void print(Map <Shape, Integer> map) {

        for (Map.Entry<Shape, Integer> pair : map.entrySet()) {
            Shape sh = pair.getKey();

            if (sh instanceof Circle) {
                System.out.printf(sh + "%10.3s\n", ((Circle) sh).getRadius());
            }
            else if (sh instanceof Rectangle) {
                System.out.printf(sh + "%7.3s%6.3s\n", ((Rectangle) sh).getHeight(),
                        ((Rectangle) sh).getWidth());
            }
            else if (sh instanceof Triangle) {
                System.out.printf(sh + "%8.3s%6.3s\n", ((Triangle) sh).getHeight(),
                        ((Triangle) sh).getBase());
                }
            }
        }
    }