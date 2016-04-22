package javacore.module10;

import javacore.module9.CaesarCipher;

import java.io.*;
import java.util.Scanner;

/**
 Домашнее задание к Модулю 10.
 Реализовать сохранение/загрузку текстового сообщения в файл с предварительным
 шифрованием/расшифрованием. Предусмотреть обработку различных ошибок ввода/вывода.
 */
public class Main {

    private static final String FILE_NAME = "c:\\535.txt";

    public static void main(String[] args) throws IOException {

        File file = FileChecker.getFile(FILE_NAME);

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(file)))
        {
            CaesarCipher cipher = new CaesarCipher();

            String message = scanMessage();

            if (!message.trim().isEmpty()) {
                String encodedMessage = cipher.encode(message);
                writer.write("Encoded message is: " + encodedMessage + "\r\n");

                String decodedMessage = cipher.decode(encodedMessage);
                writer.write("Decoded message is: " + decodedMessage + "\r\n");
            }
            else System.out.println("Message was empty.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't find file to write");
        }
    }

    private static String scanMessage() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}