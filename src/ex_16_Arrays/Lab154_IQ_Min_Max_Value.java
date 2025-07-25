package ex_16_Arrays;

public class Lab154_IQ_Min_Max_Value {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_output = give_me_Max(array);
        System.out.println("Max value= " + max_output);
        int min_output = give_me_Min(array);
        System.out.println("Min value= " + min_output);

    }

    static int give_me_Max (int[]array){
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;

    }

    static int give_me_Min (int[]array){
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;

    }
}
