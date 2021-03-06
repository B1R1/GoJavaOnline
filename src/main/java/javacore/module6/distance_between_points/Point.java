package javacore.module6.distance_between_points;

class Point {

    private double point_x1;
    private double point_x2;

    public Point(double point_x1, double point_x2) {
        this.point_x1 = point_x1;
        this.point_x2 = point_x2;
    }

    public double getPoint_x1() {
        return point_x1;
    }

    public void setPoint_x1(double point_x1) {
        this.point_x1 = point_x1;
    }

    public double getPoint_x2() {
        return point_x2;
    }

    public void setPoint_x2(double point_x2) {
        this.point_x2 = point_x2;
    }
}