package ex_16_Arrays;

public class Lab_157_IQ {
    public static void main(String[] args) {
        //give the second highest number in the array
int[] number = {12, 34, 10, 1, 100, 3, 4, 32};

        int max = number[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                secondMax = max;
                max = number[i];
            } else if (number[i] > secondMax && number[i] != max) {
                secondMax = number[i];
            }
        }

        System.out.println("Second highest number is: " + secondMax);
    }
}