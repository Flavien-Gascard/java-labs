package Useful_Utilities_Methods_Wrappers;

public class Wrapper_Classes {
    public static void main(String[] args) {
        {
        // Wrapper class = Provides a way to use primitive data types as reference data
        // TYPES
        // Reference data types contain useful methods
        // Can be used with collections <arrayList>

        // Primitive //Wrapper
        // --------- //----------
        // boolean // Boolean
        // char // Character
        // int // Integer
        // double //Double

        // autoboxing = the automatic conversion that the java compilier makes between
        // the primitive type and reference type
        // unboxing = the reverse of autoboxing. Automatic conversion of Wrapper class
        // to primitive type
        }
        // autoboxing examples (can access methods in wrapper classes):
        Boolean myWrapperBoolean = true;
        Character myWrapperChar = '@';
        Integer myWrapperInt = 123;
        Double myWrapperDouble = 3.14;
        String myString = "Flavien";

        
        // unboxing example
        if (myWrapperBoolean) {
            System.out.println("this is true");
        } else
            System.out.println("This is false");
    }

}
