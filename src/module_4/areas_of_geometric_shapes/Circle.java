package module_4.areas_of_geometric_shapes;

public class Circle  implements Shape {

    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (circleRadius * circleRadius);
    }
}