package javacore.module10;

import java.io.File;
import java.io.IOException;

class FileChecker {

    public static File getFile(String fileName) {

        boolean created;

        File file = new File(fileName);

        if (!file.exists()) {
            try {
                created = file.createNewFile();
                System.out.println("File is created: "+ created);
            } catch (IOException e) {
                System.out.println("Failed to create file");
            }
        }
        return file;
    }
}