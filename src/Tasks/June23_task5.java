package Tasks;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class June23_task5 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your age");
        try {
            int scanner = s1.nextInt();
            if (scanner < 0) {
                System.out.println("Age cannot be negative");
            } else if (scanner >=18){
                System.out.println("You are eligible to vote");
            }else {
                System.out.println("You are not allowed to vote");
            }

        }catch (java.util.InputMismatchException e){
            System.out.println("Please enter a valid integer for age.");
        }
        s1.close();


    }
}
