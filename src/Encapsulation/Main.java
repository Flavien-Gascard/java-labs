package Encapsulation;

public class Main {

    public static void main (String[] args){

Car car = new Car("Chevrolet", "Camoro", 2010);

//  not visable without getters and setters
// System.out.println(car.make());
System.out.println(car.getMake());


// Not good - need setters to set values of an object with private variables
// car.year = 2022;
car.setYear(2024);
System.out.println(car.getYear());
car.setModel("Toyota");
System.out.println(car.getModel());
car.setMake("4-Runner");
System.out.println(car.getMake());

    }

}
