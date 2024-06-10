package JavaCoreLabs.Conditional_Statements;

public class If_Statement {

public static void main (String[] args){

int x = 75;

// Notice the heirarchy of the if statements - The flow does matter!
if (x >= 75) {System.out.println("Hello Boomer");}

else if (x >=18) {System.out.println("You are considered an adult");}

else if (x >= 13) {System.out.println("You are a teenager");}

else {System.out.println("You are not an adult");}

}


}
