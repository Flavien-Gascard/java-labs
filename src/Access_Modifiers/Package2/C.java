package Access_Modifiers.Package2;


// Note here: If public is removed here - C will only be available within the same package
public class C {
    String defaultMessage = "This is the default";
    public String publicMessage = "This is public";
    private String privateMessage = "This is a private message";


public static void main(String[] args){

    String privateMessage2 = "This is a private message";

    // Wont work
    // System.out.println(C.privateMessage);
    // Will work as it is within the same class
    System.out.println(privateMessage2);
}


    
}
