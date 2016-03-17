package module_6_updated.module_4_exception_added.areas_of_geometric_shapes;

public class Triangle implements Shape {

    private double triangleBase;
    private double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double calculateArea() {
        if (triangleBase > 0 && triangleHeight > 0) {
            return triangleBase * triangleHeight * 0.5;
        } else throw new IllegalArgumentException();
    }
}
