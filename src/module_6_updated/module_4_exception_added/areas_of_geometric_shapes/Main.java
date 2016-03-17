package module_6_updated.module_4_exception_added.areas_of_geometric_shapes;

/*
Домашнее задание к Модулю 6
1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 0);
        try {
            double areaOfTriangle = triangle.calculateArea();
            System.out.println("Triangle area is: " +areaOfTriangle);
        }catch (IllegalArgumentException e) {
            System.out.println("ERROR: could not calculate triangle area. All sides must be greater than zero");
        }

        Rectangle rectangle = new Rectangle(2, 0);
        try {
            double areaOfRectangle = rectangle.calculateArea();
            System.out.println("Rectangle area is: " + areaOfRectangle);
        }catch (IllegalArgumentException e) {
            System.out.println("ERROR: could not calculate rectangle area. All sides must be greater than zero");
        }

        Circle circle = new Circle(-2);
            try {
                double areaOfCircle = circle.calculateArea();
                System.out.println("Circle area is: " + areaOfCircle);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: could not calculate circle area. Circle radius  must be greater than zero");
            }
    }
}

