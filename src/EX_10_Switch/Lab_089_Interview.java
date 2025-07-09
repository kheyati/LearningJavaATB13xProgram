package EX_10_Switch;

public class Lab_089_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){ // this is also a valid statement

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
