package EX_11_For_Loop;

public class Lab113_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {//0 to 49, 50 times
            if(i == 5){
                continue; // skip the code and move to next that is to the for statement
            }
            System.out.println(i);
        }
    }
}
