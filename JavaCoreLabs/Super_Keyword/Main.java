package JavaCoreLabs.Super_Keyword;

public class Main {

    public static void main(String[] args) {

        // Person person1 = new Person("Flavien", 52);
        // System.out.println(person1.toString());

        // Now for the super keyword in the profession class
        // that extends person
        Employee employee = new Employee("Flavien", 52, "Software Engineer");
        System.out.println(employee.toString());

    }

}
