package ex_16_Arrays;

public class Lab_158_Array_Find_Element {
    public static void main(String[] args) {
        //find an element in the array

        int[] a = {23, 43, 45, 67, 87, 90};

        //find 67 & its index]
        int target = 67;
        for (int i = 0; i < a.length; i++) {
            if( target == a[i]) {
                System.out.println(i);
            }
        }
    }
}
