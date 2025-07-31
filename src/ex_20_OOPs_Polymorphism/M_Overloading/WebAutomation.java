package ex_20_OOPs_Polymorphism.M_Overloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser();
        b1.startBrowser("Chrome");
    }
}

class Browser{
    void startBrowser(){
        System.out.println("Starting default browser");
    }

    String startBrowser(String browser){
        System.out.println("Starting browser: "+ browser);
        return browser;
    }
}
