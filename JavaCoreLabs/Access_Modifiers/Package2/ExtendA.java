package JavaCoreLabs.Access_Modifiers.Package2;

import JavaCoreLabs.Access_Modifiers.Package1.A;

public class ExtendA extends A {
    public static void main (String[] args) {

        C c = new C();
        // default is only visabe within the same package
        System.out.println(c.defaultMessage);


        // System.out.println(c.privateMessage);


        // Protected will only work if the Variable is extended
        ExtendA extendA = new ExtendA();

        System.out.println(extendA.protectedMessage);





    }

}
