package module_6.module_4_exception_added.distance_between_two_points;

public class DistanceBetweenPoints {

    public double getDistance (Point point_A, Point point_B)
    {
        return Math.sqrt( Math.pow(point_A.getPoint_x2() - point_A.getPoint_x1(), 2) +
                Math.pow(point_B.getPoint_x2() - point_B.getPoint_x1(), 2));
    }
}


