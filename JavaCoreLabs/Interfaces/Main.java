package JavaCoreLabs.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Create Object (MyClass1 implements myInterface1)
        MyClass1 myClass1 = new MyClass1();
        // Call methods in class1 that overide empty methods from implemented interface
        myClass1.myMethod1InInterface1();
        myClass1.myMethod2InInterface1();
        myClass1.myMethod3InInterface1();

        System.out.println("===============================================");

        // Create Object (MyClass2 implements myInterface2)
        MyClass2 myClass2 = new MyClass2();
        // Call methods in class2 that overide empty methods from implemented interface
        myClass2.myMethod1InInterface2();
        myClass2.myMethod2InInterface2();
        myClass2.myMethod3InInterface2();

        System.out.println("===============================================");

        MyClass3 myClass3 = new MyClass3();
        // Call methods in class2 that overide empty methods from implemented interface
        myClass3.myMethod1InInterface1();
        myClass3.myMethod2InInterface1();
        myClass3.myMethod3InInterface1();
        myClass3.myMethod1InInterface2();
        myClass3.myMethod2InInterface2();
        myClass3.myMethod3InInterface2();

    }

}
