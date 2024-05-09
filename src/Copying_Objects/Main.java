package Copying_Objects;

public class Main {
    public static void main(String[] args) {

        MyObject myObject1 = new MyObject("Flavien", 172.5, 52);
        MyObject myObject2 = new MyObject("Jessica", 130.2, 53);
        MyObject myObject3 = new MyObject("Lucas", 155.7, 20);

        // Notice different memory addresses for each object created
        System.out.println(myObject1 + "Different Address!");
        System.out.println(myObject2 + "Different Address!");

        // Notice if we just say myObject2 = myObject 1 the memory addresses are the
        // same - That is a problem
        myObject2 = myObject1;

        System.out.println(myObject1 + "Same address!");
        System.out.println(myObject2 + "Same address! ");

        // We should intsead create a method that updates values to ensure seperate
        // object(s)
        // are being created instead of referencing the same object's memory location

        myObject3.copy(myObject1);
        System.out.println(myObject3 + "\n" + myObject1);


        // We can also create a copy constructor in the MyObject class to create a copy during instantiation
        // This is a better way of doing it!
        MyObject myObject4 = new MyObject(myObject1);
        System.out.println(myObject1 + "\n" + myObject4);

    }

}
