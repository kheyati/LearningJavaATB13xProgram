package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab249_NestedArray {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("kiwi");
        fruits1.add("papaya");
        System.out.println(fruits1);

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("cherry");
        System.out.println(fruits2);

        List<String> vegetables = new ArrayList<>();
        vegetables.add("tomato");
        vegetables.add("onion");
        vegetables.add("potato");
        System.out.println(vegetables);

        List allfruits = new ArrayList();
        allfruits.add(fruits1);
        allfruits.add(fruits2);
        allfruits.add(vegetables);
        System.out.println(allfruits);


    }
}
