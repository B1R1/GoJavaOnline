package module_4.areasOfGeometricShapes;
/*
Домашнее задание к Модулю 4.
1. Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.
 */
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5);
        double areaOfTriangle = triangle.calculateArea();

        Rectangle rectangle = new Rectangle(2, 3);
        double areaOfRectangle = rectangle.calculateArea();

        Circle circle = new Circle(7);
        double areaOfCircle = circle.calculateArea();

        System.out.println(areaOfTriangle);
        System.out.println(areaOfRectangle);
        System.out.println(areaOfCircle);

    }
}

