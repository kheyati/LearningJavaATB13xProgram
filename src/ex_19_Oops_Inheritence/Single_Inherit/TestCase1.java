package ex_19_Oops_Inheritence.Single_Inherit;

public class TestCase1 extends CommontoAll {

    void runningTC1(){
        startBrowser();
        System.out.println("TC 1 starting");
        readExcelFile();
        readDB();
        closeBrowser();
    }
}
