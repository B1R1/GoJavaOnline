package module_6.files;

import java.io.*;

public class ImageFile implements File {

    ImageFile imageFile = new ImageFile();
    String fileName = "c:\502.png";

    public void show() {
        try {
            FileReader fileReader = new FileReader(fileName);
            fileReader.read();
            System.out.println("See the picture.");
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
            imageFile.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: image file could not or should not be cloned.");
        }
    }

    @Override
    public void download() {

        try {
            imageFile.download();
        } catch (IllegalStateException e) {
            System.out.println("Error: Java environment or Java application" +
                    " is not in an appropriate state for the requested operation");
        }
    }

    @Override
    public void delete() {
        try {
            imageFile.delete();
            if (!imageFile.equals(null))
            {
                throw new FileAlreadyDeletedException();
            }
        } catch (FileAlreadyDeletedException e) {
            System.out.println("Error: file has been already deleted.");
        }
    }
}
