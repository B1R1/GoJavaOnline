package javacore.module6.geometric_shapes;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.width = rectangleWidth;
        this.height = rectangleHeight;
    }

    @Override
    public double calculateArea() throws NegativeValueException {
        if (width > 0 && height > 0) {
            return width * height;
        }
        else throw new NegativeValueException();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
