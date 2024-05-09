package Variables_And_Expressions;

public class Variables {

    public static void main(String[] args) {
        // PRIMITIVE DATA TYPES:
/*
            * lower-case camel notation, 
            * uses a memory location - 
            * faster to retrieve - 
            * has to contain a value
*/
        byte myByte = 1; // One byte => -128 - +128
        short myShort = 10000; // 2 bytes => Stores whole numbers from -32,768 to 32,767
        int myInt = 129; // 4 bytes => Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 10000000; // 8 bytes => Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 3.14f; // 4 bytes => Stores fractional numbers (6 to 7 decimal digits)Needs an f at the end in order to convert from double
        double myDouble = 12.2464677; // 8 bytes => Stores fractional numbers (15 decimal digits)
        boolean myBool = true; // One bit => 1 or 0 (true or false)
        char myChar = 'f'; // 2 bytes => Stores a single character/letter or ASCII values

        // Swapping Variables:
        String x = "X";
        String y = "Y";

        String temp = x;
        x=y;
        y=temp;


        // Sysouts
        {
        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myBool = " + myBool);
        System.out.println("myChar = " + myChar);
        System.out.println("x is now: " + x);
        System.out.println("y is now: " + y);
        }
        // Non - PRIMITIVE DATA TYPES:
/*
        
            * lower-case camel notation, 
            * uses a reference to objects 
            * slower to retrieve compared to primitive 
            * Can contain NULL
            * Mostly associated with the String datatype
*/
        String myEmailPrefix = "flaviengascard";
        String myDomainName = "gmail.com";
        myChar = '@';
        String myEmailAddress = myEmailPrefix + myChar + myDomainName;

        System.out.println("My e-mail address is: " + myEmailAddress);

    }
}
