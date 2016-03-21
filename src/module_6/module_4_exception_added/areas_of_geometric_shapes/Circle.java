package module_6.module_4_exception_added.areas_of_geometric_shapes;

public class Circle  implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        if (radius > 0) {
            return Math.PI * (radius * radius);
        }
        else throw new IllegalArgumentException();
    }
}