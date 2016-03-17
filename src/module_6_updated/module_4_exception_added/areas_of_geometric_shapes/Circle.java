package module_6_updated.module_4_exception_added.areas_of_geometric_shapes;

public class Circle  implements Shape {

    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double calculateArea() {
        if (circleRadius > 0) {
            return Math.PI * (circleRadius * circleRadius);
        } else throw new IllegalArgumentException();
    }
}