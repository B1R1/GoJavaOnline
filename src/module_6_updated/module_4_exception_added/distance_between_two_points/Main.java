package module_6_updated.module_4_exception_added.distance_between_two_points;

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

        DistanceBetweenTwoPoints d = new DistanceBetweenTwoPoints();
        double result = d.calculateDistance(pointFirst, pointSecond);
        System.out.println("Distance between two points is: " + result);


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(String.valueOf(result));
            System.out.println("Data has been record to file: "  + fileName);

        } catch (IOException e) {
            System.out.println("ERROR: Data hasn't recorded.");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("ERROR: <Writer> hasn't been closed.");
            }
        }
    }
}
