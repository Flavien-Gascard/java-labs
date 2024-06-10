package JavaCoreLabs.Conditional_Statements;

public class Methods2 {

    public static void main(String[] args) {

        // Callback or invoke method here in main

        System.out.println(sum(8, 7));
        System.out.println(sum(8, 7, 10));

        System.out.println(sum(8.3, 7.2));
        System.out.println(sum(8.3, 7.2, 10.0));

    }

    // Create method here int is the return type -
    // call also be void which doesn't return anything
    // (The method will just execute whatever code)
    static int sum(int x, int y) {
        return x + y;
    }

    // Overloading methods - 
    // same method name just different number of parameters and even different datatypes
    // Method signature
    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static double sum(double x, double y, double z) {
        return x + y + z;
    }

}
