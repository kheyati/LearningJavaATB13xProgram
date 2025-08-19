package ex_25_OOPs_Interfaces;

public class Lab202_Abstraction {
    public static void main(String[] args) {

    }
}


abstract class Incomplete_abstract{

    // DC
    Incomplete_abstract (){
        System.out.println("Default Constuctor allowed in abstract class");
    }

    int a = 10; //this is not final variable, can be changed
    abstract void display1();
    void display2(){
        System.out.println("print");
    }
}

interface Incomplete_Interface{

    // Constructor
//    Incomplete_Interface(){
//        System.out.println("Constructor not allowed in interfaces");
//    }

    int a = 10; // this is a final variable, cannot be changed
    void display();

    default void display2(){
        System.out.println("default is allowed");
    }

    static void display3(){
        System.out.println("static is allowed");
    }
}

