package ex_12_DoWhile;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 0;
//        while (a < 0) {
//            System.out.println(a);
//            a++;
//        }
        do {
            System.out.println("Run one time atleast even if condition is not true");
            a++;
        } while (a < 0);
    }
    }


