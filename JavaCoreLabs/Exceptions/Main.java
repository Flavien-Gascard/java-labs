package JavaCoreLabs.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

try {        

System.out.println("Enter a whole number to divide");
int x = scanner.nextInt();

System.out.println("Enter a whole number to divide by");
int y = scanner.nextInt();

int z = x/y;
System.out.println(x + " divided by " + y + " = " + z);
}
catch (ArithmeticException e){
    System.out.println("Error : " + e);
}
catch (InputMismatchException e){
System.out.println("Error : " + e);
}

finally{
    System.out.println("This is the final block - which will always be executed - even with an exception.\nThis is good for closing files, scanners etc...");
scanner.close();
}
    }

}
