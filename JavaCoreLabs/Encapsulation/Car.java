package JavaCoreLabs.Encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

Car(String make, String model, int year){
    this.make = make;
    this.model = model;
    this.year = year;
}

// Getters and Setters are needed to retrieve private varaiables in objects
public String getMake(){
    return make;
}
public String getModel(){
    return model;
}
public int getYear(){
    return year;
}

// Setters return void
public void setYear(int year){
    this.year = year;
}

public void setModel(String model){
    this.model = model;
}

public void setMake(String make){
    this.make = make;
}



}
