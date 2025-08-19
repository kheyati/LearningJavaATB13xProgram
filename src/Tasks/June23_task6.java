package Tasks;

import java.util.Scanner;

public class June23_task6 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);


        try{
            System.out.println("Enter the first number");
            int n1= num.nextInt();
            System.out.println("Enter the second number");
            int n2= num.nextInt();
                if (n1 > n2){
                System.out.println(n2 + " is the smaller number");
            } else if (n2 > n1) {
                System.out.println(n1 + " is the smaller number");
            } else{
                System.out.println( n1 +" is equal to "+ n2);
            }
        }catch (java.util.InputMismatchException e){
            System.out.println("Enter a valid Integer");
        } finally {
            num.close();
        }
    }

}
