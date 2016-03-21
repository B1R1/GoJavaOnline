package module_6.module_4_exception_added.areas_of_geometric_shapes;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double triangleBase, double triangleHeight) {
        this.base = triangleBase;
        this.height = triangleHeight;
    }

    @Override
    public double calculateArea() {
        if (base > 0 && height > 0) {
            return base * height * 0.5;
        }
        else throw new IllegalArgumentException();
    }
}
