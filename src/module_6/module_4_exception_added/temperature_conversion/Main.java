package module_6.module_4_exception_added.temperature_conversion;

import java.io.*;
import java.io.File;

/**
 Домашнее задание к Модулю 6
 1. Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации.
 При этом использовать УЖЕ СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)
 */
public class Main {

    public static void main(String[] args) {

        Temperatures temps = getTemps();

        CelsiusToFahr c = new CelsiusToFahr();
        double fahrenheit = c.convert (temps);

        FahrenheitToCel f = new FahrenheitToCel();
        double celsius = f.convert (temps);
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
