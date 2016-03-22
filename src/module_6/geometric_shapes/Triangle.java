package module_6.geometric_shapes;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double triangleBase, double triangleHeight)
    {
        this.base = triangleBase;
        this.height = triangleHeight;
    }

    @Override
    public double calculateArea() throws NegativeValueException {
        if (base > 0 && height > 0) {
            return base * height * 0.5;
        }
        else throw new NegativeValueException();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

}
