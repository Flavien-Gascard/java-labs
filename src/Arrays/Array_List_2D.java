package Arrays;

import java.util.ArrayList;

public class Array_List_2D {


public static void main (String[] args){

// ArrayLists can be used during runtime (as opposed to Arrays which are not)
ArrayList<String> protiens = new ArrayList();
protiens.add("Fish");
protiens.add("Beef");
protiens.add("Chicken");
protiens.add("Pork");

ArrayList<String> vegtables = new ArrayList();
vegtables.add("Tomatoes");
vegtables.add("Zucchini");
vegtables.add("Green Beans");
vegtables.add("Peppers");

ArrayList<String> sides = new ArrayList<>();
sides.add("Mashed potatoes");
sides.add("Fries");
sides.add("Bacon");
sides.add("Nuts");

// Declare a 2d ArrayList:
ArrayList<ArrayList<String>> menu = new ArrayList<>();

menu.add(protiens);
menu.add(vegtables);
menu.add(sides);

System.out.println(menu.get(0).get(0));





}




}
