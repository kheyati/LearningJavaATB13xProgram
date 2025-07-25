package ex_19_Oops_Inheritence.Single_Inherit;

public class Real_scenario {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        System.out.println("------------");

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();
        System.out.println("--------------");

        CommontoAll c1 = new CommontoAll();

        TestCase1 t3 = new TestCase1();

        CommontoAll c2 = new TestCase1();

        CommontoAll c3 = new TestCase2(); // dynamic dispatch, father reference with child object
        c3.startBrowser();




    }
}
