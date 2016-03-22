package module_6.distance_between_points;

/*
 Домашнее задание к Модулю 6
 1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = "c:\\502.txt";

        Point pointFirst = new Point(4, 5);
        Point pointSecond = new Point(8, 9);

        double distance = getDistance(pointFirst, pointSecond);

        recordToFile(fileName, distance);
    }

    private static double getDistance(Point pointFirst, Point pointSecond)
    {
        DistanceBetweenPoints d = new DistanceBetweenPoints();
        return d.getDistance(pointFirst, pointSecond);
    }

    private static void recordToFile(String fileName, double distance)
    {
        FileWriter writer = null;

        try {
            writer = new FileWriter(fileName);
            writer.write(String.valueOf(distance));
        }
        catch (IOException e)
        {
            System.out.println("ERROR: Data hasn't recorded.");
        }
        finally
        {
            try {
                if (writer != null) {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("ERROR: <Writer> hasn't been closed.");
            }
        }
    }
}
