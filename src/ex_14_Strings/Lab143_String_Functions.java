package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        //System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        System.out.println(name.concat(" Patel"));
        System.out.println(name.contains("So"));
        System.out.println(name.equalsIgnoreCase("SONAL"));
        System.out.println(name.indexOf('n'));

        String s1 = "madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m"));

        System.out.println(name.length());

        System.out.println(name.replace('n', 'N'));

        String name4= "kheyati.mal@join.com";
        String[] split_name = name4.split("@");
        System.out.println(split_name[0]);
        System.out.println(split_name[1]);
        //System.out.println(split_name[2]); //ArrayIndexOutOfBoundsException


        System.out.println(name.substring(1, 3)); // 1 included 3 excluded (12)

        System.out.println("SONAL".toLowerCase());

        System.out.println("sonal".toUpperCase());

        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("a"));

        String anotherPalindrome= "Niagara, O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

        String s11 = "Hello";
        String s12 = " World";

        String res = s11 +s12;
        System.out.println(res);
    }

}
