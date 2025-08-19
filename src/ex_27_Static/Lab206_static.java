package ex_27_Static;

public class Lab206_static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(11);
        System.out.println(ref1.a); // instance var
        System.out.println(ref2.a); // instance var
        System.out.println(A.b);// static

        ref1.display(); //10
        ref2.display(); //11


    }

}

class A{
    int a;// instance variable
    static int b = 10; // shared b/t objects

    //param constructor
    A (int a){
        this.a = a;
    }

    void display(){
        System.out.println(this.a);
    }

    static void static_method(){
        System.out.println("I am Static method, I will be called when the class is loaded");
        //System.out.println(this.a); static methods cannot access the non static variables
        System.out.println(b); //
    }
}

