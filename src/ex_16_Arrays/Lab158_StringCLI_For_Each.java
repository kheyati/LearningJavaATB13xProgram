package ex_16_Arrays;

public class Lab158_StringCLI_For_Each {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("-----------");
for(Object o: args){
    System.out.println(o);
}
    }
}
