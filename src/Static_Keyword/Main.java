package Static_Keyword;

public class Main {

    public static void main(String[] args){

Items item1 = new Items("Item 1");
Items item2 = new Items("Item 2");
Items item3 = new Items("Item 3");
Items item4 = new Items("Item 4");

// Accessing the static variable itemCount 
// each Items object created above will 
// increment the static variable by one 
System.out.println(Items.itemCount);

// Don not use this - not good practice:
// The static field Items.itemCount should be accessed in a static way (not as a seperate object)
System.out.println(item1.itemCount);

// Static method
Items.displayItemCount();

    }
    

}
