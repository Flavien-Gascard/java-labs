package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public static void main(String[] args) {
        String filePath = "fgproject\\src\\main\\java\\com\\fgprojectjava\\fgproject\\Files\\myFile.txt";

        try {

            FileReader reader = new FileReader(filePath);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error : " + e);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }

    }
}