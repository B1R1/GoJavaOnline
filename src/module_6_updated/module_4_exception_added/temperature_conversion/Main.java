package module_6_updated.module_4_exception_added.temperature_conversion;

import java.io.*;

/**
 Домашнее задание к Модулю 6
 1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
 При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */
public class Main {

    public static void main(String[] args) {

        int fahrenheitDegree = 0;

        try {
            FileReader reader = new FileReader(new File("c:\\502.txt"));
            try {
                fahrenheitDegree = reader.read();
            } catch (IOException e) {
                System.out.println("Error: could not read data from file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find the file.");
        }


        TemperaturesValue tData = new TemperaturesValue(1, fahrenheitDegree);

        CelsiusToFahrenheit c = new CelsiusToFahrenheit();
        double result_1 = c.fromCelsiusToFahrenheit (tData);

        FahrenheitToCelsius f = new FahrenheitToCelsius();
        double result_2 = f.fromFahrenheitToCelsius(tData);


        System.out.println(result_1);
        System.out.println(result_2);
    }
}
