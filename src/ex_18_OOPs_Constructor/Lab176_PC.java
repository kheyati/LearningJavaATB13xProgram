package ex_18_OOPs_Constructor;

public class Lab176_PC {
    public static void main(String[] args) {
       BabyA b1 = new BabyA();
        System.out.println(b1.name);
       BabyA b2 = new BabyA();
        System.out.println(b2.name);
// you can give personised value
       BabyA b3 = new BabyA("Kheyati", "565757", 1994, 9, 26);
        System.out.println(b3.name);
        BabyA b4 = new BabyA("Pawan", "342343", 1988, 6, 10);
        System.out.println(b4.name);
    }
}

class BabyA {
    String name;
    String aadhar_number;
    int year;
    int month;
    int date;

// DC
    BabyA(){
        name = "Gugu";
        aadhar_number = "09877";
        year = 1994;
        month = 9;
        date = 20;
    }
    // Parameterised Constructor
    // This is generic in nature
    BabyA(String name_user, String aadhar_number_user,int year_user, int month_user, int date_user ){
        this.name = name_user ;
        this.aadhar_number =  aadhar_number_user;
        this.year = year_user ;
        this.month = month_user ;
        this.date = date_user ;
    }
}
