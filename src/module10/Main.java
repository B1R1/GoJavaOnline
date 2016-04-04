package module10;

import module9.CaesarCipher;

import java.io.*;
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
        try {
            if (!file.exists()) {
                    if (!file.createNewFile()) {
                        System.out.println("File already exist");
                    }
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            CaesarCipher cipher = new CaesarCipher();

            String message = scanMessage();

            if (!message.isEmpty()) {
                String encodedMessage = cipher.encode(message);
                writer.write("Encoded message is: " + encodedMessage + "\r\n");

                String decodedMessage = cipher.decode(encodedMessage);
                writer.write("Decoded message is: " + decodedMessage+ "\r\n");
            }
            else System.out.println("Message was empty.");

            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String scanMessage() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}