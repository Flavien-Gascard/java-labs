package WorkingWithSounds;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String filePath = "fgproject\\src\\main\\java\\com\\fgprojectjava\\fgproject\\WorkingWithSounds\\spellCast1.wav";

        Scanner scanner = new Scanner(System.in);
        File file = new File(filePath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P)lay, S)top, R)eset, Q)uit");
            System.out.print("==> ");

            response = scanner.next();
            response= response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S") : clip.stop();
                break;

                case ("R") : clip.setMicrosecondPosition(0);
                break;

                case ("Q") : clip.close();
                scanner.close();
                break;

                default:
                    System.out.println("Enter in a valid choice...");
                
            }

        

        }

    }

}
