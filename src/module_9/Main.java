package module_9;

import java.util.ArrayList;
import java.util.List;

/**
 Домашнее задание к Модулю 9.
 Реализовать шифрование текста с помощью алгоритма Цезаря.
 Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java
 */
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> encodedList = new ArrayList<>();
        List<String> decodedList = new ArrayList<>();

        ListCreator.createList(list);

        CaesarCipher cipher = new CaesarCipher();
        cipher.encode(list, encodedList);
        print(encodedList);

        System.out.println();

        cipher.decode(encodedList, decodedList);
        print(decodedList);
    }

    private static void print(List<String> list) {
        for (String line : list) {
            System.out.println(line);
        }
    }
}

