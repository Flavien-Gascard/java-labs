package Access_Modifiers.Package1;

import Access_Modifiers.Package2.C;

public class A {
    protected String protectedMessage = "This is protected";
    public static void main (String[] args) {


        

        C c = new C();
        // default is only visabe within the same package
        // System.out.println(c.defaultMessage);

        // Public can be accessed in other packages
        System.out.println(c.publicMessage);

    }

    
    

}
