package module_6.module_4_exception_added.areas_of_geometric_shapes;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.width = rectangleWidth;
        this.height = rectangleHeight;
    }

    @Override
    public double calculateArea() {
        if (width > 0 && height > 0) {
            return width * height;
        }
        else throw new IllegalArgumentException();
    }
}
