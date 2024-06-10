package JavaCoreLabs.Useful_Utilities_Methods_Wrappers;
import java.util.Random;

public class Random_Generator {

    public static void main (String[] args){

        // Initialize a new Random object
        Random random = new Random();

        int x = random.nextInt(20)+1;

        System.out.println(x);



    }

}
