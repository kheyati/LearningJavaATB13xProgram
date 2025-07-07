package ex_06_Ternary_Operator;

public class Lab_067_Nested_TO {
    public static void main(String[] args) {
        // max of 3 numbers

        int x = 11;
        int y = 9;
        int z = -9;

        int result = (x > y) ? ((x > z) ? x : z): ((y > z) ? y: z);
        System.out.println(result);

        // x> y? : a : b
        // a -> x > z? x: z
        // b -> y > z? y: z
    }
}
