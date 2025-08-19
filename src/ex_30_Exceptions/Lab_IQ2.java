package ex_30_Exceptions;

public class Lab_IQ2 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
           int a = 10/c;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch (Exception f){
            System.out.println(f);
        }
    }
}
