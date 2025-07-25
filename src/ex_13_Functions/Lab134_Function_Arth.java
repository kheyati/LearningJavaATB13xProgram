package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the first number");
        int a = 0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }else {
            System.out.println("Enter a valid number");
            // return;
            System.exit(0);
        }



        System.out.println(" Enter the second number");
        int b = 0;

        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }else {
            System.out.println("Enter a valid number");
            // return;
            System.exit(0);
        }

        int sum_of_nos = add(a, b);
        System.out.println("Sum = " +sum_of_nos);

        int sub_of_nos = sub(a, b);
        System.out.println("Difference = " + sub_of_nos);

        int multi_of_nos = multiply(a, b);
        System.out.println("Product = " +multi_of_nos);

        int divide_of_nos = divide(a, b);
        System.out.println("Quotient = " +divide_of_nos);
    }


    //Creation a function of Add, Sub, Multi, Div
    // Logic : 1: Input
    // a& B using scanner
    // result in var of int type


    static int add (int a, int b){
        return a+b;
    }
    static int sub (int a, int b){
        return a-b;
    }
    static int multiply (int a, int b){
        return a*b;
    }

    static int divide (int a, int b){
        if (b == 0){
             throw new ArithmeticException(" number cannot be 0");
            //System.out.println("number cannot be 0");
            //System.exit(0);
            //return 0;
        }
        return a/b;
    }


    // 2: create functions with logic for Add, Sub, Multi, Div

    // 3: Write code
}
