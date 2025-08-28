package ex_30_Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab234_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            validateAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) throws ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException {
        if (age <18){
            throw new ArithmeticException ("You are below 18, cant go to goa");
        }
    }
}
