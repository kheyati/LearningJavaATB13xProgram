package ex_16_Arrays;

public class Lab_159_ArrayCopy {
    public static void main(String[] args) {
        int[] original = {1,2,3};
        int[] copy = new int [original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        //System.out.println();
    }
}
