package ex_30_Exceptions;

public class Lab_Jr_Qa_Vs_SrQA {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/ a;
            System.out.println(b);

        }catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
