package ex_27_Static;

public class Lab208_Real {
    public static void main(String[] args) {
        ATB ref = new ATB();
        String aa= ref.setName("Kheyati");
        System.out.println(aa);

        long bb= ref.setPhone(554237);
        System.out.println(bb);
    }
}
class ATB{

    static {
        System.out.println("Static block, I will load when the class is loaded");
    }

    {
        System.out.println("IIB, I will load when object is created");
    }

    private String name;
    private long phone;



    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public long setPhone(long phone) {
        this.phone = phone;
        return phone;
    }


    static String courseName = "ATB 13x";
    static String mentor = "Pramod";

    static void doAssignment(){
        System.out.println("Do assignment");
    }
    static void joinClass(){
        System.out.println("Join Class");
    }

     void assignment(){
        System.out.println("Everyone does assignments differently");
    }
}


