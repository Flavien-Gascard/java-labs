package Input_Features_Scanners_JOptionPane;

import java.util.Scanner;

public class Scanners {
    public static void main (String[] args){

        // Create a new Scanner object using the Scanner Java utility import
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();


        System.out.println("Your name is "+ name + ", you are " + age + " years old, and you like " + food +".");


scanner.close();



    }

}
