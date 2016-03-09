package module_4.temperatureConversion;
/**
 Домашнее задание к Модулю 4
 2. Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении.
 */
public class Main {

    public static void main(String[] args) {

        TemperaturesData tData = new TemperaturesData(1, 12);

        CelsiusToFahrenheit c = new CelsiusToFahrenheit();
        double result_1 = c.fromCelsiusToFahrenheit (tData);


        FahrenheitToCelsius f = new FahrenheitToCelsius();
        double result_2 = f.fromFahrenheitToCelsius(tData);

        System.out.println(result_1);
        System.out.println(result_2);
    }
}
