package ex_19_Oops_Inheritence.Single_Inherit;

public class TestCase2 extends CommontoAll {

    void runningTC2(){
        startBrowser();
        System.out.println("Running TC 2");
        readDB();
        readExcelFile();
        closeBrowser();
    }
}
