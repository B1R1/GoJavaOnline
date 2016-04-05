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

        SampleDataListCreator.createList(list);

        if (haveMessage(list)) {
            System.out.println("Original lines are: " + list);
        }

        CaesarCipher cipher = new CaesarCipher();

        if (haveMessage(list)) {
            for (String index : list) {
                encodedList.add(cipher.encode(index));
            }
            System.out.println("Encoded lines are: " + encodedList);
        }

        if (haveMessage(encodedList)) {
            for (String index : encodedList) {
                decodedList.add(cipher.decode(index));
            }
            System.out.println("Decoded lines are: " + decodedList);
        }
    }

    private static boolean haveMessage (List<String> list) {
        boolean haveMessage = true;
        if (list.size() == 0) {
            haveMessage = false;
            System.out.println("Haven't any lines for processing.");
        }
        return haveMessage;
    }
}