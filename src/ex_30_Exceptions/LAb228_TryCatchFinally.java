package ex_30_Exceptions;

import java.util.Scanner;

public class LAb228_TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the v");
        int v = sc.nextInt();
        try{
            int b = 20/v;
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            sc.close(); // this will always get eexcuted
        }
    }
}
