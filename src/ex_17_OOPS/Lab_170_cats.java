package ex_17_OOPS;

public class Lab_170_cats {
    public static void main(String[] args) {
       //Object creation
        Cat c1 = new Cat();

        // Object creation
        new Cat();

        //Reference creation
        Cat c2;

        // c1 is using behaviour(method)
        c1.running();

        // not initialised c2.running();
        new Cat().running();
    }
}

//Constructor
class Cat{
    String name;


// Method without params & return type
    void running() {
        System.out.println("Running");
    }
}
