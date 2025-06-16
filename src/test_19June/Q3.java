package test_19June;


public class Q3 {
    public static void main(String[] args) {
        //Create a program to show the difference between ++i and i++.
        int i;

        // Pre-increment example
        i = 5;
        System.out.println("Pre-increment:");
        System.out.println("Initial value of i: " + i);
        // increments the value first and then returns
        System.out.println("Value after ++i: " + (++i));
        System.out.println("Value of i now: " + i);

        System.out.println();

        // Post-increment example
        i = 5;
        System.out.println("Post-increment:");
        System.out.println("Initial value of i: " + i);
        // returns the value first and then increments
        System.out.println("Value after i++: " + (i++));
        System.out.println("Value of i now: " + i);
    }
}
