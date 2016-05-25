package codegym.practice3;

//    Дано повний шлях до файла в Unix системі.
//    Наприклад /home/../var/./lib//file.txt
//    Необхідно повернути спрощений варіант. (/var/lib/file.txt)

import java.util.Objects;

public class UnixPath {
    public String simplify(String input) {
//        if (input.equals("//")) return "/";
//        String result = input.replaceAll("//", "/");
//        result = result.replaceAll("/./", "/");
//
//        if (!result.equals("//")) {
//            if (result.endsWith("/") || result.endsWith(".")) {
//                result = result.substring(0,result.length() - 1);
//            }
//        }
//        return result;


        String result = input;
        while (Objects.equals(result.substring(0, result.length() - 1), ".")) {
            result = result.substring(0, result.length() - 1);
        }

        while (Objects.equals(result.substring(0, result.length() - 1), "/")) {
            result = result.substring(0, result.length() - 1);
        }

            return result;
    }
}

