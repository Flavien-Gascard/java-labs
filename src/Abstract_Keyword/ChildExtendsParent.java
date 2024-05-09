package Abstract_Keyword;

public class ChildExtendsParent extends AbstractParent{

void parentMethod1(){
    System.out.println("This is overiding abstract method 1 in the abstract Parent class");
}

@Override
void parentMethod2() {
    System.out.println("This is overiding abstract method 2 in the abstract Parent class");
}




}
