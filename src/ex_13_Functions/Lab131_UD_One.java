package ex_13_Functions;

public class Lab131_UD_One {
    public static void main(String[] args) {
        //first function with int return type
        int result = sumofnumbers(3, 4);
        System.out.println(result);
        // 2nd function with no return typr
        sum_of_numbers_no_return(12, 15);
    }
    static int sumofnumbers(int a, int b){
        return a+b;
    }
    static void sum_of_numbers_no_return(int a, int b){
        System.out.println(a+b);
    }
}
