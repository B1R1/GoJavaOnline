package module6.geometric_shapes;

/*
Домашнее задание к Модулю 6
1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 0);
        getArea(triangle);

        Rectangle rectangle = new Rectangle(2, 0);
        getArea(rectangle);

        Circle circle = new Circle(-2);
        getArea(circle);
    }

    private static void getArea(Circle circle) {
        try {
            double area =  circle.calculateArea();
        } catch (NegativeValueException e) {
            System.out.println("ERROR: Radius must be greater than zero");
        }
    }

    private static void getArea(Rectangle rectangle) {
        try {
            double area = rectangle.calculateArea();
        } catch (NegativeValueException e) {
            System.out.println("ERROR: Value of sides must be greater than zero");
        }
    }

    private static void getArea(Triangle triangle) {
        try {
            double area = triangle.calculateArea();
        } catch (NegativeValueException e) {
            System.out.println("ERROR: Value of sides must be greater than zero");
        }
    }
}