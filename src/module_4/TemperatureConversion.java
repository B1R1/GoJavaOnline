package module_4;

/**
 Домашнее задание к Модулю 4
 2. Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении.
 */
public class TemperatureConversion {
    private static double fahrenheitValue;
    private static double celsiusValue;

    public static void main(String[] args) {
        fromCelsiustoFahrenheit();
        fromFahrenheittoCelcius();
    }

    public static double fromCelsiustoFahrenheit ()
    {
        return  (celsiusValue * 1.8) + 32;
    }

    public static double fromFahrenheittoCelcius ()
    {
        return (fahrenheitValue - 32) * (5 / 9);
    }


}
