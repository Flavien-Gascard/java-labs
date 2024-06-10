package JavaCoreLabs.Useful_Utilities_Methods_Wrappers;

public class PrintF {
public static void main(String[] args){
    
    boolean myBool = true;
    char myChar = '@';
    String myString = "Flavien";
    int myInt = 32;
    double myDouble = 3.14;
    double myDoubleFlag = 111000010;
    

    System.out.printf("%b", myBool);
    System.out.println();

    System.out.printf("%c", myChar);
    System.out.println();

    // Sample width %10s - will add spacing
    System.out.printf("Hello%10s", myString);
    System.out.println();

    System.out.printf("%d", myInt);
    System.out.println();

    // Precision
    System.out.printf("My double value with precision : %.2f", myDouble);
    System.out.println();

    // Flags
    // adding commas to each 1000
    System.out.printf("My double value with commas : %,f", myDoubleFlag);
    System.out.println();

    // left justify (-)
    System.out.printf("My double value with left justify : %-20f", myDoubleFlag);
    System.out.println();

    // Adding positive / negative sign (+)
    System.out.printf("My double value with positive / negative : %+f", myDoubleFlag);
    System.out.println();

    // Adding padding
    System.out.printf("My double value with padding : %020f", myDoubleFlag);






}
}
