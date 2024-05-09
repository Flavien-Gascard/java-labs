package Variables_And_Expressions;

import java.util.Random;

public class Variable_Scope2 {

// Declaring parameters outside methods for golbal scope
// Can access variables anywhere within the class

// Instantiate a new Random object 
// and declare a number variable Globally
Random random2;
int number2;
public Variable_Scope2(){
    random2 = new Random();
    roll2();

}

void roll2(){
    number2 = random2.nextInt(6)+1;
    System.out.println(number2);
}



}
