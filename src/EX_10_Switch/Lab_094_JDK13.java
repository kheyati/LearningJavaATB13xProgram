package EX_10_Switch;

public class Lab_094_JDK13 {
    public static void main(String[] args) {
        int itemCode = 007;

        switch (itemCode){
            case 001, 002, 003: //multiple match comma separated are allowed
                System.out.println("All of the items are electronic gadgets");
                break;
            case 004, 005, 006:
                System.out.println("All of the items are household items");
                break;
            default:
                System.out.println("Miscellaneous");
        }
    }
}
