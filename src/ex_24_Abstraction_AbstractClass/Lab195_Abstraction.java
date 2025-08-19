package ex_24_Abstraction_AbstractClass;

import ex_19_Oops_Inheritence.ex_19_OOPs_Inhertience_Multilevel.Father;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car();
        Child c2 = new Child();

        father f2 = new Child(); // dynamic dispatch

        //father f1 = new father();// cannot create object as it is an abstract class
        c2.loan50k();
    }
}

class Car{
    // Concrete class coz it doesnt have abstract method

    void done(){

    }
}

abstract class father{

    // abstract method
    abstract void loan50k();
    //complete method
    void laon25k(){
        System.out.println("25k paid");
    }
}

class Child extends father{
    @Override
    void loan50k() {
        System.out.println("Son has to repay 50k loan");
    }
}
