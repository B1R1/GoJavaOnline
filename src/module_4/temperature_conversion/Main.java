package module_4.temperature_conversion;
/**
 Домашнее задание к Модулю 4
 2. Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении.
 */
public class Main {

    public static void main(String[] args) {

        TemperaturesValue tData = new TemperaturesValue(1, 12);

        CelsiusToFahrenheit c = new CelsiusToFahrenheit();
        double result_1 = c.fromCelsiusToFahrenheit (tData);


        FahrenheitToCelsius f = new FahrenheitToCelsius();
        double result_2 = f.fromFahrenheitToCelsius(tData);

        System.out.println(result_1);
        System.out.println(result_2);
    }
}
