package ex_12_DoWhile;

public class Lab127_DoWhile_Real {
    public static void main(String[] args) {

        //Web automation we want to call a function atleast 1 time
        int number = 0;
        // 0-> it can be 0 to 10
        do {
            System.out.println(number);
            //call a function
            //close a file
            //open a file
            number++;
        }while (number<0);
    }
}
