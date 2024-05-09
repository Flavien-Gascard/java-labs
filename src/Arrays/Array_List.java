package Arrays;

import java.util.ArrayList;




public class Array_List {
// ArrayList = a resizable array.
//             Elements be be added and removed after compilation phase
//             Store reference data types

public static void main (String[] args){

ArrayList<String> food = new ArrayList<String>();

food.add("Pizza");
food.add("Sushi");
food.add("Cheeseburger");
food.add("Salad");


// Common methods
food.set(0, "Hotdog");
food.remove(3);
// food.clear();

for (int i = 0; i < food.size(); i++) {
    System.out.println(food.get(i));
    
}


} 




}
