package test_19June;

public class Q5 {
    //Write a program that demonstrates comparison and logical operators.

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a < b: " + (a < b));     // true
        System.out.println("a > b: " + (a > b));     // false
        System.out.println("a <= c: " + (a <= c));   // true
        System.out.println("b >= c: " + (b >= c));   // true

        System.out.println("-------------------------------------");

        // Logical Operators boolean
        boolean condition1 = (a < b);   // true
        boolean condition2 = (a == c);  // true
        boolean condition3 = (b < c);   // false

        System.out.println("Logical Operators:");
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // true && true = true
        System.out.println("condition1 || condition3: " + (condition1 || condition3)); // true || false = true
        System.out.println("!condition3: " + (!condition3));                           // !false = true
        System.out.println("!(condition1 && condition3): " + (!(condition1 && condition3))); // !(true && false) = true
    }
}
