package module_4;

/*
 Домашнее задание к Модулю 4
3. Создать класс вычисляющий расстояние между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2).
 */

public class DistanceBetweenTwoPoints {

    private double pointA_x1 = 4;
    private double pointA_x2 = 5;

    private double pointB_y1 = 8;
    private double pointB_y2 = 9;


    public static void main(String[] args) {
        DistanceBetweenTwoPoints d = new DistanceBetweenTwoPoints();
        System.out.println(d.distance());
    }

    public double distance()
    {
        return Math.sqrt( Math.pow(pointA_x2 - pointA_x1, 2) + Math.pow(pointB_y2 - pointB_y1, 2));
    }
}


