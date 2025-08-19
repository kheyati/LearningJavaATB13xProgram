package ex_26_IIB;

public class Lab203_IIB {
    //IIB-> Instance initialization block
    // automatically called when object is created

    public static void main(String[] args) {

        A a = new A();
        System.out.println("**********");
        A a1 = new A();


    }
}

class A{

    A(){
        System.out.println("DC");
    }
// IIB creation
    {
        System.out.println("Hi, I am IIB, I am called on object creation");
    }

    {
        System.out.println("2nd IIB");
    }

    static {
        System.out.println("I am static block, I am called only on class loading which happens once");
    }
}
