package ex_17_OOPS;

public class Lab_168_Person {
//These are properties, instance variables, member variables
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;
// these are behaviours, member functions, functions, methods
    void walk(){
        System.out.println("Walking");
    }
    void eat(String food){
        System.out.println("Eating");
}
    String sleep(){
        System.out.println("Sleeping");
      return null;
  }
    String drink (String drink){
        System.out.println("Drinking");
      return null;
  }
}
