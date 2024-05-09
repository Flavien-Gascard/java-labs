package Static_Keyword;

public class Items {

    // This static variable is a single copy of the variable or method and is shared
static int itemCount;
String itemID;

Items(String itemID){
    this.itemID = itemID;
    itemCount ++;

}

static void displayItemCount(){
    System.out.println("You have " + itemCount + " items.");

}



}
