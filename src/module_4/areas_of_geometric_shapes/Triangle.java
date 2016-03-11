package module_4.areas_of_geometric_shapes;

public class Triangle implements Shape {

    private double triangleBase;
    private double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double calculateArea() {
        return triangleBase * triangleHeight * 0.5;
    }
}
