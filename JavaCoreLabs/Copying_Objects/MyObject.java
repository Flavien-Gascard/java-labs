package JavaCoreLabs.Copying_Objects;

public class MyObject {
    // Declare variables (arguments)
    String myString;
    double myDouble;
    int myInt;

    // Constructor for MyObject
    MyObject(String myString, double myDouble, int myInt) {
        this.myString = myString;
        this.myDouble = myDouble;
        this.myInt = myInt;
    }
    // Copy Constructor for copying during instantiation
    MyObject (MyObject myObject){
        this.copy(myObject);
    }


    

    // Encapsulation with getters and setters
    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public double getMyDouble() {
        return myDouble;
    }

    public void setMyDouble(double myDouble) {
        this.myDouble = myDouble;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void copy(MyObject myObject) {
        this.setMyDouble(myObject.getMyDouble());
        this.setMyInt(myObject.getMyInt());
        this.setMyString(myObject.getMyString());
    }

}
