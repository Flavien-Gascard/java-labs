package JavaCoreLabs.Files;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {

        String filePath = "fgproject\\src\\main\\java\\com\\fgprojectjava\\fgproject\\Files\\myFile.txt";

        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("This file exists");
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is a file: " + file.isFile());
            // System.out.println("Deleting File: " + file.delete());
        } else
            System.out.println("File does not exist...");

    }
}
