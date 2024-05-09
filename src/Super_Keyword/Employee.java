package Super_Keyword;

public class Employee extends Person{

    String job;

    Employee(String name, int age, String job){
        // Here is where we define the super keyword in order to inherit Person arguments
        super(name, age);
        this.job = job;
    }

    public String toString(){
        return super.toString() + this.job;

    }

}
