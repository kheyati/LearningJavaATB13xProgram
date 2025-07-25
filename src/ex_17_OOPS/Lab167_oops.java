package ex_17_OOPS;

public class Lab167_oops {
    public static void main(String[] args) {
        Student s1 = new Student(); // calls default constructor
        Student s2; // reference creation
        new Student(); // object creation // calls default constructor
    }
}

class Student{
    String name;

    //Default constructor, same name as the class name
    Student(){
        System.out.println("DC");
    }

    void sleep() {
        System.out.println("Hi!");
    }
}
