package ex_30_Exceptions;

public class La222_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        } catch (ArithmeticException f){
            System.out.println("Dont divide by 0");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
