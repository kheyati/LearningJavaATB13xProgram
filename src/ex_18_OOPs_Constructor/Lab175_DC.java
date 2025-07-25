package ex_18_OOPs_Constructor;

import ex_01_Java_Basic._classname;

public class Lab175_DC {
    public static void main(String[] args) {
        // Object creation
        Car c1 = new Car();
        c1.name= "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
    }
}

// Class creation
class Car {
    String name;
    int year;
    String model;


    // Default Constructor
    Car(){
        name = "UnknownCar";
        year = 1991;
        model = "XYZ";
    }
}