package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab253_AL_Students {
    public static void main(String[] args) {
        Students s1 = new Students("Amit", "1");
        Students s2 = new Students("Bhushan", "2");
        Students s3 = new Students("Chanda", "3");

        List<Students> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
//        s1.printDetails();
//        s2.printDetails();
//        s3.printDetails();



    }

}

class Students{

    private String name;
    private String rollNo;

    public Students(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

//    public void printDetails(){
//        System.out.println("Student name: "+this.name);
//        System.out.println("Student roll No.: "+ this.rollNo);
//    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}