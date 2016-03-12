package module_6.files;

import java.io.*;

public class AudioFile implements File {

    AudioFile audioFile = new AudioFile();
    String fileName = "c:\502.avi";

    public void play() {
        try {
            FileReader fileReader = new FileReader(fileName);
            fileReader.read();
            System.out.println("Listen to audio.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: can't find file.");
        }
        catch (IOException e) {
            System.out.println("Error: can't read file.");
            e.printStackTrace();
        }
    }


    @Override
    public void edit() {
        try {
            audioFile.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: audio file could not or should not be cloned.");
        }
    }

    @Override
    public void download() {
        try {
            audioFile.download();
        } catch (IllegalStateException e) {
            System.out.println("Error: Java environment or Java application" +
                    " is not in an appropriate state for the requested operation.");
        }
    }

    @Override
    public void delete() {
        try {
            audioFile.delete();
            if (!audioFile.equals(null)) {
                throw new FileAlreadyDeletedException();
            }
        } catch (FileAlreadyDeletedException e) {
            System.out.println("Error: file has been already deleted.");
        }
    }
}