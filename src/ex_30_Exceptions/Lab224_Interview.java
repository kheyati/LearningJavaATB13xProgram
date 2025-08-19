package ex_30_Exceptions;

public class Lab224_Interview {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
            int a = 10/0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e);;
        }catch (Exception e){
            System.out.println("Multiple catch");
        }
        System.out.println("End");
    }

}
