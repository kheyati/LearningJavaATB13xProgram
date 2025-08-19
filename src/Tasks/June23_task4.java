package Tasks;

import java.util.Scanner;

public class June23_task4 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        String scan = s1.next().toLowerCase();

       if(scan.length()!=1 || !Character.isLetter(scan.charAt(0))){
           System.out.println("Please enter a valid single alphabet letter");
       }else {
           if (scan.equals("a") || scan.equals("e")  || scan.equals("i") || scan.equals("o") || scan.equals("u") ) {
               System.out.println(scan + " is a vowel");
           } else {
               System.out.println(scan + " is a consonant");
           }
           s1.close();
       }

//



    }
}
