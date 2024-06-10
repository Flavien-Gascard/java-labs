package JavaCoreLabs.Variables_And_Expressions;

import java.util.Random;
import java.util.Scanner;

public class Logical_Operators {

    public static void main(String[] args) {
        // The logical && (And) operater => Evaluates if all values to True
        {
            // Random test values
            Random random = new Random();
            int temp = random.nextInt(35) + 5;

            if (temp > 30) {
                System.out.println(temp + " => It's Hot outside");
            } else if (temp >= 20 && temp <= 30) { // evaluates if a condition is true for left and right operands
                System.out.println(temp + " => It is perfect outside");
            } else {
                System.out.println(temp + " => It is cold outside");
            }
        }
        // The Logical || (Or) operator => Evaluates if either value is True or false
        {
            // Create user terminal inputd
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press q or Q to quit");
            String result = scanner.next();
            // Notice the .equals instead of == needed for logical or (||)
            if (result.equals("q") || result.equals("Q")) {
                System.out.println("Quitting the game.....");
                
            }
            else {System.out.println("Good place for a loop!!!!");}
        }
        // The Logical ! (Not) operator => Reverses boolean value of the condition
        {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Press q or Q to quit");
            String result2 = scanner2.next();
            // Notice the .equals instead of == needed for logical or (||)
            if (!result2.equals("q") && !result2.equals("Q")) { 
                System.out.println("Still Playing!!!!");
                scanner2.close();
            }
            else{System.out.println("Quitting the game.....");}


        }
        }
    }

