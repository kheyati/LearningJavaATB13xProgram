package ex_14_Strings;

import java.util.Scanner;

public class PalindromeFn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Text");
        String input = scanner.next();
        String newString_reversed = reverseString(input);

        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    //function to reverse string without usinh inbuilt function
    static String reverseString(String userInput) {
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        return reversed;
    }
}


//    //function to reverse string
//    static String reverseStringSB(String userInput){
//        StringBuilder stringbuilder = new StringBuilder(userInput);
//        return stringbuilder.reverse().toString();
//    }
//}
