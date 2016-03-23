package module_6.geometric_shapes;

/*
Домашнее задание к Модулю 6
1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */
public class Main {

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(4, 0);
        getArea(triangle);

        Rectangle rectangle = new Rectangle(2, 0);
        getArea(rectangle);

        Circle circle = new Circle(-2);
        getArea(circle);
    }

    private static double getArea(Circle circle) {
        double area = 0;

        try {
            area =  circle.calculateArea();
        }
        catch (NegativeValueException e)
        {
            System.out.println("ERROR: Radius must be greater than zero");
        }
        return area;
    }

    private static double getArea(Rectangle rectangle) {
        double area = 0;

        try {
            area = rectangle.calculateArea();
        }
        catch (NegativeValueException e)
        {
            System.out.println("ERROR: Value of sides must be greater than zero");
        }
        return area;
    }

    private static double getArea(Triangle triangle) {
        double area = 0;

        try {
            area = triangle.calculateArea();
        }
        catch (NegativeValueException e)
        {
            System.out.println("ERROR: Value of sides must be greater than zero");
        }
        return area;
    }
}
