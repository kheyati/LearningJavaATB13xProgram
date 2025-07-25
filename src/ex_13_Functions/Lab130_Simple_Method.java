package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        kheyati();
        return_int();
        return_boolean();
        return_float();

    }


    static void kheyati(){
        System.out.println("No return");
    }
    static int return_int() {
        System.out.println(1234);
        return 1234;

    }
    static boolean return_boolean(){
        System.out.println("true");
        return true;
    }
    static float return_float(){
        System.out.println(123.4321);
        return 123.4321f;
    }
}
