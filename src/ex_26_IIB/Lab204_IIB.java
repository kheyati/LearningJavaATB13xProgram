package ex_26_IIB;

public class Lab204_IIB {
    public static void main(String[] args) {
        A1 one  = new A1();
    }
}

class A1{

    {
        System.out.println("IIB 1");
    }
    {
        System.out.println("IIB 2");
    }
    {
        System.out.println("IIB 3");
    }

    static {
        System.out.println("SIB");
    }

    A1(){
        System.out.println("Default constructor");
    }
}
