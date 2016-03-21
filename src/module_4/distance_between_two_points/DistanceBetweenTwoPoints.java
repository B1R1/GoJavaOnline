package module_4.distance_between_two_points;

public class DistanceBetweenTwoPoints {

    public double calculateDistance(Point point_A, Point point_B)
    {
        return Math.sqrt( Math.pow(point_A.getY() - point_A.getX(), 2) +
                Math.pow(point_B.getY() - point_B.getX(), 2));
    }
}


