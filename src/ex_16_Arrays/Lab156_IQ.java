package ex_16_Arrays;

public class Lab156_IQ {
    public static void main(String[] args) {
        //print sum of an array

        int[] numbers = {12, 34, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

    }
}
