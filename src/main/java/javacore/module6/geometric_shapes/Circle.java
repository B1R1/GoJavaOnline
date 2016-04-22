package javacore.module6.geometric_shapes;

public class Circle implements Shape, Comparable<Circle> {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() throws NegativeValueException {
        if (radius > 0) {
            return Math.PI * (radius * radius);
        }
        else throw new NegativeValueException();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public int compareTo(Circle circle) {
        return (int) (radius - circle.radius);
    }
}