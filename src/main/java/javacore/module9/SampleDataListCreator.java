package javacore.module9;

import javacore.module6.geometric_shapes.Circle;
import javacore.module6.geometric_shapes.Rectangle;
import javacore.module6.geometric_shapes.Triangle;

import java.util.List;

class SampleDataListCreator {

    private static final int CIRCLE_RADIUS = 2;
    private static final int TRIANGLE_HEIGHT = 5;
    private static final int TRIANGLE_BASE = 94;
    private static final int RECTANGLE_WIDTH = 7;
    private static final int RECTANGLE_HEIGHT = 4;

    public static void createList (List <String> list) {
        list.add(new Circle(CIRCLE_RADIUS).toString());
        list.add(new Triangle(TRIANGLE_HEIGHT, TRIANGLE_BASE).toString());
        list.add(new Rectangle(RECTANGLE_WIDTH, RECTANGLE_HEIGHT).toString());
    }
}