package ex_30_Exceptions;

public class Lab220_HAndle_Exception {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 10/2;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Div by 0 not allowed");
        }
        System.out.println(a);
    }
}
