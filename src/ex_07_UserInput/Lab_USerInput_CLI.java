package ex_07_UserInput;

public class Lab_USerInput_CLI {
    public static void main(String[] args) {
        String age_string = args[0];
                int age = Integer.parseInt(age_string);
        String canIVote = age > 18 ? "Yes" : "No";
        System.out.println(canIVote);

    }
}