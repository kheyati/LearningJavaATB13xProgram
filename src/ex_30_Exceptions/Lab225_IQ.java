package ex_30_Exceptions;

public class Lab225_IQ {
    public static void main(String[] args) {
        try {
            String input_user = args[0];
            int a = Integer.parseInt(input_user);
            int output = 100/a;

        }catch (ArrayIndexOutOfBoundsException | ArithmeticException| NumberFormatException e){
            System.out.println(e);
        }
    }
}
