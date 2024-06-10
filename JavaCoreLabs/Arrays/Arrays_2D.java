package JavaCoreLabs.Arrays;

public class Arrays_2D {

    public static void main (String[] args){
        String[][] tools = new String[3][3];


        tools[0][0] = "Wrench";
        tools[0][1] = "Hammer";
        tools[0][2] = "Drill";
        tools[1][0] = "Socket Set";
        tools[1][1] = "Flat Head Screwdriver";
        tools[1][2] = "Philips Head Screw Driver";
        tools[2][0] = "Saw";
        tools[2][1] = "Safety Glasses";
        tools[2][2] = "Gloves";

for (int i = 0; i < tools.length; i++) {
    for (int j = 0; j < tools.length; j++) {
        System.out.println(tools[i][j]);
    }
}




    }

}
