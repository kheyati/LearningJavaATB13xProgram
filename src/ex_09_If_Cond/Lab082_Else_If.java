package ex_09_If_Cond;

import java.util.Scanner;

public class Lab082_Else_If {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if (age >= 18){
            System.out.println("Allowed to vote");
        }else {
            System.out.println("Not allowed");
        }
    }
}
