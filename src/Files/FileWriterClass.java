package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {

        String filePath = "fgproject\\src\\main\\java\\com\\fgprojectjava\\fgproject\\Files\\myFile.txt";
        // Needs a try catch block in order to work
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("This is line number 1\nThis is line number 2\nThis is line 3\nThis is line 4");
            writer.append("\nThis is line 5");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
