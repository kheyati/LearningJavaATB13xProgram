package ex_16_Arrays;

public class Lab_166_Left_Triangle {
    public static void main(String[] args) {
        // print
        // * * *
        // * *
        // *
        int n = 3;
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
