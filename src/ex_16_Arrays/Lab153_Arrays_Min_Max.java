package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Min_Max {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);

        System.out.println("Max value= " + array[array.length-1]);
        System.out.println("Min value= "+ array[0]);


    }

}
