package ex_18_OOPs_Constructor;

public class Lab179_Const_Overload {
    public static void main(String[] args) {
        // Object creation and setting the value for the parameterised constructor
        Person1 p1 = new Person1("Kheyati", 987544556, "#8, 5th main, 678 cross, hgjgjg, bluru- 560097");
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.address);
    }
}

// Class creation
class Person1 {
    String name;
    long phone;
    String address;


    // Parameterised Constructor
    Person1(String name_user){
        this.name= name_user;
    }
    // constructor overloading
    Person1(String name_user, long phone_user, String address_user){
        this.name= name_user;
        this.phone= phone_user;
        this.address= address_user;
    }
    // constructor overloading
    Person1(String name_user, long phone_user) {
        this.name = name_user;
        this.phone = phone_user;
    }


}
