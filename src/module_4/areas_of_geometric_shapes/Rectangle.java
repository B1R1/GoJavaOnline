package module_4.areas_of_geometric_shapes;

public class Rectangle implements Shape {

    private double rectangleWidth;
    private double rectangleHeigth;

    public Rectangle(double rectangleWidth, double rectangleHeigth) {
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeigth = rectangleHeigth;
    }

    @Override
    public double calculateArea() {
        return rectangleWidth * rectangleHeigth * 0.5;
    }
}
