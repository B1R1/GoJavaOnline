package module_4.areas_of_geometric_shapes;

public class Rectangle implements Shape {

    private double rectangleWidth;
    private double rectangleHeight;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public double calculateArea() {
        return rectangleWidth * rectangleHeight;
    }
}
