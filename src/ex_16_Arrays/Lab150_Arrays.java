package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        //1st way
        int [] marks = {1,2,3,4,5,6};
//2nd way
        int[] mark2 = new int[5]; // Fixed size, size = 5 index = 0 to 4
        String[] names = new String[3]; // Fixed size, size = 3 index = 0 to 2
        names[0]= "Kheyati";
        names[1]= "Pawan";
        names[2]= "Pransh";
        //names[3]= "abcd";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


    }
}
