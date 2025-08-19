package ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.Friday);
        System.out.println(Project_Names.vwo);
    }

}


enum Day{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

enum Project_Names{
    google, restAssured, Katalon, vwo
}