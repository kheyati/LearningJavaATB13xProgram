package ex_25_OOPs_Interfaces;

public class Lab200_Multiple_Inheritence_Interface {
    public static void main(String[] args) {
        Child c = new Child();
        c.money();
    }
}

class Child implements Father1, Father2{

    @Override
    public void money() {
        System.out.println("Child earns own money");
    }
}

interface Father1 {
    void money();

}

interface Father2 {
    void money();

}
