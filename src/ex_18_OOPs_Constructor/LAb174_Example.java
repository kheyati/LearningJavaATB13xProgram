package ex_18_OOPs_Constructor;

public class LAb174_Example {
    public static void main(String[] args) {
        // Object creation
        webAutomation w1 = new webAutomation();
    }

}
// Class creation
class webAutomation{

    // Constructor creation
    webAutomation(){
        System.out.println("Read CSV File");
        System.out.println("Open the page before loading scripts");
        System.out.println("this will run automatically on object creation");
        System.out.println("you dont have to call any method");
    }
}
