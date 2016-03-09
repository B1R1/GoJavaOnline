package module_4.areasOfGeometricShapes;

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