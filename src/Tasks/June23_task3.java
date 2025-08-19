package Tasks;

import java.util.Scanner;

public class June23_task3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        try {
            System.out.println("Enter the first numbers");
            int s1 = scanner1.nextInt();
            System.out.println("Enter the second number");
            int s2 = scanner1.nextInt();
            if (s1>s2){
                System.out.println(s1 + " is the max number");
            }else if (s2>s1){
                System.out.println(s2 + " is the max number");
            }else{
                System.out.println("Both numbers are equal");
            }
        }catch (java.util.InputMismatchException e) {
            System.out.println("Enter a valid number");
        }
    }
}
