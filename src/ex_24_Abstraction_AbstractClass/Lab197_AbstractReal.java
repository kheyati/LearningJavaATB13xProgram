package ex_24_Abstraction_AbstractClass;

public class Lab197_AbstractReal{
    public static void main(String[] args) {
        // we cannot use Employee class
    Company c1 = new Company();
    c1.computePay();

    }
}


class Company extends Employee{
    @Override
    double computePay() {
        System.out.println("Pay= " + 1000);
        return 1000;
    }
}

abstract class Employee{
    private String name;
    private String address;
    private int phone;

    Employee(){
        System.out.println("Default Constructor");
    }

    // Param Constructor
     Employee(String name, String address, int phone) {
         System.out.println(" Making an employee");
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    abstract double computePay();

    void mailCheck(){
        System.out.println("Mailing to check " + this.name + " "+ this.address + " " + this.phone);
    }

    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



}





