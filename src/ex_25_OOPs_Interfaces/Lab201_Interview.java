package ex_25_OOPs_Interfaces;

public class Lab201_Interview {
    public static void main(String[] args) {

    }
}

class A1{}

class B1{}

abstract class Kheyati{
    abstract void kk();
}

class Test1 extends A1{}

//class Test2 extends A1,B1{} // Not allowed multiple inhertience using classes

class Test3 implements I11{}

class Test4 implements I11, I12{}

class Test5 extends A1 implements I12, I11 { }

//class Test6 implements I11 extends A1{}// not allowed, it should be extend first then implement

//interface I13 extends A1{} // not possible interface cannot extend any class

interface I3{}

interface I4{

    default void m1(){

    }

    static void m2(){

    }
// concrete methods not possible inside interface
//    void m3(){
//
//    }

}
interface I11{}

interface I12{}