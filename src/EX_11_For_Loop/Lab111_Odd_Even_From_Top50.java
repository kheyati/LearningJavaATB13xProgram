package EX_11_For_Loop;

public class Lab111_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){ // 1 to 50 & run 50 times
            if (i % 2 == 0){
                System.out.println(i + " This is a even number");

            }else{
                System.out.println(i + " This is a odd number");
            }

        }
    }
}
