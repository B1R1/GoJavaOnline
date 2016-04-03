package module_10;

import java.io.File;
import java.util.Scanner;

/**
 Домашнее задание к Модулю 10.
 Реализовать сохранение/загрузку текстового сообщения в файл с предварительным
 шифрованием/расшифрованием. Предусмотреть обработку различных ошибок ввода/вывода.
 */
public class Main {
    private static final String FILE_NAME = "c:\\src\\530.txt";

    public static void main(String[] args) {
        File file = new File (FILE_NAME);
        FileToWrite fileToWrite = new FileToWrite();
        CaesarCipher cipher = new CaesarCipher();

        String message = scanMessage();

        String encodedMessage = cipher.encode(message);
        fileToWrite.write(encodedMessage, file);

        String decodedMessage = cipher.decode(encodedMessage);
        fileToWrite.write(decodedMessage, file);

    }

    private static String scanMessage() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}