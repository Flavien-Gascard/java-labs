package Arrays;

public class Arrays {

    public static void main (String[] args){


        String[] cars = {"Camaro", "Jaguar","Mustang","Tesla","Ram"};


        for (int i = 0 ; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }


        // Can also declare size initially by creating an array object

        String[] boats = new String[4];

        boats[0] = "Motor Boat";
        boats[1] = "Paddle Boat";
        boats[2] = "Sail Boat";
        boats[3] = "Submarine";

for (int i = 0; i < boats.length; i++) {
    System.out.println(boats[i]);
}



    }

}
