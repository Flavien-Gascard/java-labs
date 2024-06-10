package JavaCoreLabs.Polymorhpism;

public class Main {

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

        // So this will not work because of the different classes (or objects in this
        // case) \
        // may have different datatypes etc....
        // myArrayOfObjects = {child1,child2,child3};

        // Need to declare the objects as a common SuperClass object
        SuperClass[] myArray = { child1, child2, child3 };

        child1.commonMethod();
        child2.commonMethod();
        child3.commonMethod();
        System.out.println("=============================================================");

        // Can also iterate through all the items in the myArray object
        for (SuperClass x : myArray) {
            // Ensure super method has an empty method that the children will override
            x.commonMethod();

        }

    }

}
