package module_4.distance_between_two_points;

/*
 Домашнее задание к Модулю 4
3. Создать класс вычисляющий расстояние между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2).
 */

public class Main {

    public static void main(String[] args) {

        Point pointFirst = new Point (4, 5);
        Point pointSecond = new Point (8, 9);

        DistanceBetweenTwoPoints d = new DistanceBetweenTwoPoints();
        double result = d.calculateDistance(pointFirst, pointSecond);
        System.out.println(result);
    }
}
