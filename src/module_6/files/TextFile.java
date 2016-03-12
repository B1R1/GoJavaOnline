package module_6.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFile implements File {

    TextFile textFile = new TextFile();
    String fileName = "c:\502.txt";

    public void read() {
        try {
            FileReader fileReader = new FileReader(fileName);
            fileReader.read();
            System.out.println("Read the text.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: can't find file");
        }
        catch (IOException e) {
            System.out.println("Error: can't read file");
            e.printStackTrace();
        }
    }

    @Override
    public void edit() {
        try {
            textFile.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: text file could not or should not be cloned.");
        }
    }

    @Override
    public void download() {
        try {
            textFile.download();
        } catch (IllegalStateException e) {
            System.out.println("Error: Java environment or Java application" +
                    " is not in an appropriate state for the requested operation");
        }
    }

    @Override
    public void delete() {
        try {
            textFile.delete();
            if (!textFile.equals(null)) {
                throw new FileAlreadyDeletedException();
            }
        } catch (FileAlreadyDeletedException e) {
            System.out.println("Error: file has been already deleted.");
        }
    }
}