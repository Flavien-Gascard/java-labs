package Arrays;

public class Array_Of_Objects {

public static void main (String[] args){


// Here are sample arrays
// int[] numbers = {1,2,3};
// char[] characters = new char[4];
// String[] strings = new String[5];

// Instead of this use declaring a size initially, do whats on line 20
// Objects[] arrayOfObjects = new Objects[3]; 

Objects item1 = new Objects("Item 1");
Objects item2 = new Objects("Item 2");
Objects item3 = new Objects("Item 3");

Objects[] arrayOfObjects = {item1, item2, item3};

// Wont need the following either, as we are assigning objects above
// arrayOfObjects[0] = item1;
// arrayOfObjects[1] = item2;
// arrayOfObjects[2] = item3;

System.out.println(arrayOfObjects[0].name);
System.out.println(arrayOfObjects[1].name);
System.out.println(arrayOfObjects[2].name);








    
}




}
