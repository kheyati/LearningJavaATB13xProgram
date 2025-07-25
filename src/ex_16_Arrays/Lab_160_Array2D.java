package ex_16_Arrays;

public class Lab_160_Array2D {
    public static void main(String[] args) {

        // 1,2,3
        //4,5,6
        //7,8,9
        int[] [] array_2d_old={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //10,20
        //30,40
        //50,60
        int [] [] array_one_more;
        array_one_more= new int[] []{
            {10, 20},
            {30, 40},
            {50, 60}
        };
        int [] [] array2d = new int [3][3];
        array2d[0][0] = 1;
        array2d[0][1] = 2;
        array2d[0][2] = 3;
        //array2d[0][3] = 3;// ArrayIndexOutOfBoundsException

        array2d[1][0] = 4;
        array2d[1][1] = 5;
        array2d[1][2] = 6;

        array2d[2][0] = 7;
        array2d[2][1] = 8;
        array2d[2][2] = 9;


        System.out.println(array_2d_old);
        System.out.println(array_one_more);
    }




}
