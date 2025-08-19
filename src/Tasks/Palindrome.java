package Tasks;

import ex_01_Java_Basic._underscore;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");

        String input = scanner.nextLine();
        String text = input.toLowerCase();

        if ()

    }
}
public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() -1;

    while (left< right){
        if (str.charAt(left) != str.charAt(right)){
            return false;
        }
        left++;
        right--;

    }
    return true;

}
