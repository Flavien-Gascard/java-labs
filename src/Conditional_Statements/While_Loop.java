package Conditional_Statements;

import java.util.Scanner;

public class While_Loop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Declare an empty value to initialize the while loop - else it will be
        // infinite
        String name = "";

        while (name.isBlank()) {
            System.out.println("What is your name?");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
        

        // Do While Loop
        // -Will always execute at least once
        String food = "";

        do {
            System.out.println("What is your favorite food?");
            food = scanner.nextLine();
        } while (food.isBlank());

        System.out.println("Your favorite food is " + food);
        scanner.close();
    }
}