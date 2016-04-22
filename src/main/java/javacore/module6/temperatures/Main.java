package javacore.module6.temperatures;

import java.io.*;

/**
 Домашнее задание к Модулю 6
 1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
 При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */
public class Main {

    public static void main(String[] args) {

        Temperatures temps = getTemps();

        Converter c = new Converter();

        double fahrenheit = c.convertFahrenheitToCel(temps);
        System.out.println("Converted fahrenheit degree is: " + fahrenheit);

        double celsius = c.convertCelsiusToFah(temps);
        System.out.println("Converted celsius degree is: " + celsius);
    }

    private static Temperatures getTemps() {
        int fahrenheitTemp = 0;
        int celsiusTemp = 0;

        try {
            FileReader reader = new FileReader(new File("c:\\502.txt"));

            try {
                fahrenheitTemp = reader.read();
                celsiusTemp = reader.read();
            } catch (IOException e) {
                System.out.println("Error: could not read data from file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find the file.");
        }
        return new Temperatures(celsiusTemp, fahrenheitTemp);
    }
}
