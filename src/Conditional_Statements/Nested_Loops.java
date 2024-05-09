package Conditional_Statements;

import java.util.Scanner;

public class Nested_Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter in the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter in the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter in the symbol you want to use for each value:");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            // Needed to display rubric correctly - otherwise it will display on one line
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }

        }

    }

}
