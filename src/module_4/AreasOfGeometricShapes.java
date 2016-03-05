package module_4;
/*
Домашнее задание к Модулю 4.
1. Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.
 */
public class AreasOfGeometricShapes {

    public static void main(String[] args) {
        Triangle.calculateTriangleArea();
        Rectangle.calculateRectangleArea();
        Circle.calculateCircleArea();
    }

    //  inner class Triangle
    static class Triangle {
        private static double triangleBase;
        private static double triangleHeight;

        Triangle(double triangleBase, double triangleHeight) {
            Triangle.triangleBase = triangleBase;
            Triangle.triangleHeight = triangleHeight;

        }

        private static double calculateTriangleArea() {
            return triangleBase * triangleHeight * 0.5;
        }
    }

    //  inner class Rectangle
    static class Rectangle {
        private static double rectangleWidth;
        private static double rectangleHeigth;

        Rectangle(double rectangleWidth, double rectangleHeigth) {
            Rectangle.rectangleWidth = rectangleWidth;
            Rectangle.rectangleHeigth = rectangleHeigth;
        }

        public static double calculateRectangleArea() {
            return rectangleWidth * rectangleHeigth * 0.5;
        }
    }


    //  inner class Circle
    static class Circle {
        private static double circleRadius;

        Circle(double circleRadius) {
            Circle.circleRadius = circleRadius;
        }

        public static double calculateCircleArea() {
            return Math.PI * (circleRadius * circleRadius);
        }
    }
}
