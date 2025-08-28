package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class LAb245_LL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Cow");

        System.out.println("Full linked list "+ animals);

        animals.removeLast();
        System.out.println("LL after removing last element "+ animals );

        animals.add(2, "Peacock");
        System.out.println("LL after adding element at 2nd index "+ animals);

        animals.removeFirst();
        System.out.println("LL after removing 1st element "+ animals);

        System.out.println("Size of LL "+ animals.size());

    }
}
