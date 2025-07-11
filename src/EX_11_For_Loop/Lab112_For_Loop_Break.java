package EX_11_For_Loop;

public class Lab112_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
