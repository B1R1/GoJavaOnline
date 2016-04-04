package module9;

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
        System.out.println("Original lines are: " + list);

        CaesarCipher cipher = new CaesarCipher();
        for (String index : list) {
            encodedList.add(cipher.encode(index));
        }
        System.out.println("Encoded lines are: " + encodedList);

        for (String index : encodedList) {
            decodedList.add(cipher.decode(index));
        }
        System.out.println("Decoded lines are: " + decodedList);
    }
}