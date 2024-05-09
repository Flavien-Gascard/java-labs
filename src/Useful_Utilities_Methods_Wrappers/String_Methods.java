package Useful_Utilities_Methods_Wrappers;

public class String_Methods {
    public static void main (String[] args){

        String name = "Flavien";
        // Equals
        boolean booleanResult = name.equals("Flavien");
        System.out.println(booleanResult);
        // Equals Ignore Case
        booleanResult = name.equalsIgnoreCase("fLaViEn");
        System.out.println(booleanResult);
        // Length
        int intResult = name.length();
        System.out.println(intResult);
        // Find Character At Index
        char charResult = name.charAt(3);
        System.out.println(charResult);
        // Find Character At An Index Number
        int indexOfResult = name.indexOf("v");
        System.out.println(indexOfResult);
        // Find out of a string is empty
        boolean isEmptyResult = name.isEmpty();
        System.out.println(isEmptyResult);
        // Change String To UpperCase
        String toUpperResult = name.toUpperCase();
        System.out.println(toUpperResult);
        // Change String To LowerCase
        String toLowerCaseResult = name.toLowerCase();
        System.out.println(toLowerCaseResult);
        // Trim Leading And Trailing Spaces
        String nameWithSpaces = "      Flavien          ";
        String trimResult = nameWithSpaces.trim();
        System.out.println(trimResult);
        // Replace A Character With Another
        String replaceResult = name.replace("F", "S");
        System.out.println(replaceResult);









    }

}
