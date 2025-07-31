package ex_20_OOPs_Polymorphism.M_Overriding;

public class Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();
        System.out.println("------------");
        FirefoxTC f1 = new FirefoxTC();
        f1.openBrowser();
        System.out.println("------------");
        CommonToAll a2 = new CommonToAll();
        a2.openBrowser();
        System.out.println("------------");
        CommonToAll a1= new ChromeTC();
        a1.openBrowser();
        System.out.println("------------");// dynamic relation
    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!!");
    }
}

class FirefoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Firefox Browser!!");
    }
}