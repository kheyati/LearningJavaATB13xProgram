package Tasks;

public class task_Piramid_27June {

    public static void main(String[] args) {
        //Print
        //  *
        // ***
        //*****

        int row = 3;
        // Print spaces
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row -i; j++) {
                System.out.print(" ");
            }
            // Print *
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();

        }
    }
}
