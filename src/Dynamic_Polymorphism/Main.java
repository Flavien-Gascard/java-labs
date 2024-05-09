package Dynamic_Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SuperClass superClass = new SuperClass();
        System.out.println("Pick a subclass:");
        System.out.println("(1) for Child1 or (2) for Child2");
        int choice = scanner.nextInt();

        // Dynamic polymorphism
        if (choice == 1) {
            superClass = new Child1();
            superClass.myMethod();
        } else if (choice == 2) {
            superClass = new Child2();
            superClass.myMethod();
        } else {
            System.out.println("Invalid option");

            superClass.myMethod();

        }
        ;

        // Child1 child1 = new Child1();

        // child1.myMethod();

    }
}
