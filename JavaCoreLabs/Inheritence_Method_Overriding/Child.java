package JavaCoreLabs.Inheritence_Method_Overriding;

public class Child extends Parent {


// Overriding the Parent Method here by declaring the same method Name 
//  and adding @Override annotation
@Override
String parentMethod(){
    return "This is overidding the inherited parent method";
}



}
