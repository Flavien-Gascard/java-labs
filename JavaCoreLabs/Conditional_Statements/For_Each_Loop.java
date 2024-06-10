package JavaCoreLabs.Conditional_Statements;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class For_Each_Loop {

public static void main (String[] args){


String[] animals = {"Bird", "Cat", "Dog", "Horse"};
ArrayList<String> animals2 = new ArrayList<String>();
animals2.add("Fish");
animals2.add("Whale");
animals2.add("Starfish");
animals2.add("Jellyfish");

for (String i : animals) {
    System.out.println(i);
}

for (String i : animals2) {
    System.out.println(i);
    
}





}


}
