package EX_10_Switch;

public class Lab_093_morethanJDK13 {
    public static void main(String[] args) {
        int itemCode = 005;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
