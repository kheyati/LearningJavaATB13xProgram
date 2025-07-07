package Tasks;

public class task3_12June {
    public static void main(String[] args) {
        int marks = 8;
        String s = marks + " =A";
        String result = marks >= 90? ("A+"): (marks >= 75? "A" : (marks >= 60? "B" : (marks >= 40? "C" : "Fail")));
        System.out.println(result);
    }
}
