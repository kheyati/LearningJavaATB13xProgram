package ex_30_Exceptions;

public class Lab227_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = 0;
        try {
            int c = 10/b;
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
        //
        finally {
            System.out.println("I will always be executed");
        }

    }
}
