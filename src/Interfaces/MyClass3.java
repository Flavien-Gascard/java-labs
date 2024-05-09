package Interfaces;

public class MyClass3 implements MyInterface1, MyInterface2{

// all inherited methods:
@Override
public void myMethod1InInterface1(){
    System.out.println("myMethod1 from Myinterface1");
};
@Override
public void myMethod2InInterface1(){
    System.out.println("myMethod2 from Myinterface1");
};
@Override
public void myMethod3InInterface1(){
    System.out.println("myMethod3 from Myinterface1");
};
@Override
public void myMethod1InInterface2(){
    System.out.println("myMethod1 from Myinterface2");
};
@Override
public void myMethod2InInterface2(){
    System.out.println("myMethod2 from Myinterface2");
};
@Override
public void myMethod3InInterface2(){
    System.out.println("myMethod3 from Myinterface2");
};




}
