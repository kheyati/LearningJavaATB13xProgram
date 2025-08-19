package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program!");
        String input_user = args[0];//java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        Integer a = Integer.parseInt(input_user); //java.lang.NumberFormatException: For input string: "fdscf"
        Integer output = 100/a; //uncheched: ˳java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of program");

    }
}
