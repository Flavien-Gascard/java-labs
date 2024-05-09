package Variables_And_Expressions;

import java.util.Random;

public class Variable_Scope {
    
// Global variables are declared outside of a method
// Local variables are declared inside a method and cannot be accessed outside of the method

// Example of a local variables by passing arguments
// to a constructor calling an outside method

// Constructor
public Variable_Scope(){
    Random random = new Random();
    int number=0;
    // passing local variables to the methods here which will work
    roll(random, number);
}

void roll(Random random, int number) {
    number = random.nextInt(6)+1;
    System.out.println(number);
}






}
