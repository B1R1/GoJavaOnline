package module_10;

import java.io.*;

class FileToWrite {

    public void write(String message, File file) {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(message);
            } catch (IOException e) {
            e.printStackTrace();
            }
        finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error: failed to close stream.");
                e.printStackTrace();
            }
        }
    }
}
