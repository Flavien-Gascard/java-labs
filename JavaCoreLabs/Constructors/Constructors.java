package JavaCoreLabs.Constructors;

public class Constructors {

    // Define the parametrs needed for the object in the args list
    String name;
    int age;
    double weight;

    // Construct the args needed for this class to be used
    Constructors(String name, int age, double weight) {
        // Assign values using this keyword -
        // This assigns the values passed to a new object called in Main
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // This keyword from the constructor can be used in methods as well
    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }

}
