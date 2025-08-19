package ex_27_Static;

public class LAb207_Static {
    public static void main(String[] args) {
        B ref = new B();
        ref.display();
    }
}


class B{

    static {
        System.out.println("Static block");
    }

    int a = 10;
    static int b = 20;

    void display(){
        System.out.println(b);
        System.out.println("Non static fn");
    }

    static void commonToAll(){
       // System.out.println(a);//non-static variable a cannot be referenced from a static context
        System.out.println("Static fn");
    }

    static class C{
        // not used in automation
    }
}
