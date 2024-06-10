package JavaCoreLabs.Useful_Utilities_Methods_Wrappers;

import java.util.Scanner;

public class Math_Utilities {

    public static void main(String[] args) {
        double x = 3.14;
        double y = 10.23;
        double z = -23.674;

        double myMax = Math.max(x, y);
        double myAbsolute = Math.abs(z);
        double mySquareRoot = Math.sqrt(y);
        double myRound = Math.round(y);
        double myCeil = Math.ceil(y);
        double myFloor = Math.floor(y);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " + z);

        scanner.close();

        System.out.println(myMax);
        System.out.println(myAbsolute);
        System.out.println(mySquareRoot);
        System.out.println(myRound);
        System.out.println(myCeil);
        System.out.println(myFloor);

    }

}
