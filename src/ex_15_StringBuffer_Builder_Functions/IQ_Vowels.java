package ex_15_StringBuffer_Builder_Functions;

import java.util.Scanner;

public class IQ_Vowels {
    public static void main(String[] args) {
        // Count vowels and consonants of user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String input = sc.next();
        input = input.toLowerCase();
        //input = input.replaceAll("\\s+", "");

        System.out.println(input);
        int vowel = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonants++;
            }

        }
        System.out.println("No. of vowels: " + vowel);
        System.out.println("No. of consonants: " + consonants);
    }
}
