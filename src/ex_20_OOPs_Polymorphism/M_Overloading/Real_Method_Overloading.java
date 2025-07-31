package ex_20_OOPs_Polymorphism.M_Overloading;

public class Real_Method_Overloading {
    public static void main(String[] args) {
        Home h1= new Home();
        h1.task();
        int t1= h1.task(12);
        System.out.println(t1);
        boolean t2 = h1.task(false);
        System.out.println(t2);
    }
}
 class Home{
    void task(){
        System.out.println("Task 1");
    }


     int task(int a){
         System.out.println("Task 2");
         return a;
     }

     boolean task(boolean b){
         System.out.println("Task 3");
         return b;
     }

 }