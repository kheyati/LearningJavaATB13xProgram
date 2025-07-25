package ex_16_Arrays;

public class Lab163_Array_Iterate_Loop {
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};


        System.out.println(matrix.length); //how a=many rows it has
        System.out.println("----------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println(); // add space after every row

        }




    }
}
