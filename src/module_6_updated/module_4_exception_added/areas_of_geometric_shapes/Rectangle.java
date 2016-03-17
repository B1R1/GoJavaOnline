package module_6_updated.module_4_exception_added.areas_of_geometric_shapes;

public class Rectangle implements Shape {

    private double rectangleWidth;
    private double rectangleHeight;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public double calculateArea() {
        if (rectangleWidth > 0 && rectangleHeight > 0) {
            return rectangleWidth * rectangleHeight;
        } else throw new IllegalArgumentException();
    }
}
