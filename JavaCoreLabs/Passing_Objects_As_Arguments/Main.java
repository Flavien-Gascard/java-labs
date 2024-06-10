package JavaCoreLabs.Passing_Objects_As_Arguments;

public class Main {
    public static void main (String[] args){

        Service service = new Service();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Camaro");

       service.needsService(car1);
       service.needsService(car2);

}
}
