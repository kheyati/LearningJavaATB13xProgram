package ex_21_OOPs_Encapsulation;

public class Lab190_Real_Bank {

    public static void main(String[] args) {
        ICICIBank kheyati = new ICICIBank("Kheyati",10000);
        System.out.println(kheyati.getName());
        System.out.println(kheyati.getBal());
        System.out.println("New bal set by cashier");
        kheyati.setBal(12345678, false);
        long k1 = kheyati.getBal();
        System.out.println(k1);
    }
}


class ICICIBank {


    // Variables are encapsulated using private
    private String name;
    private long bal;

    //PC is created for both the variables
    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
    // Getter & Setters are created

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    // only allowed if you are a cashier
    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed");
        }
    }
}
