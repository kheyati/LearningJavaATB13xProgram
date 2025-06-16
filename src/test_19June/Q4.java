package test_19June;

public class Q4 {
    //Write a program to demonstrate type casting (both implicit and explicit)
    public static void main(String[] args) {
        // Implicit Type Casting
        int intValue = 100;
        // int to double
        double dValue = intValue;
        System.out.println("Implicit Casting (int to double):");
        System.out.println("int value = " + intValue);
        System.out.println("double value = " + dValue);

        // Explicit Type Casting
        double dVal = 9.99;
        // double to int
        int iVal = (int) dVal;
        System.out.println("Explicit Casting (double to int):");
        System.out.println("double value = " + dVal);
        System.out.println("int value = " + iVal);

    }
}

