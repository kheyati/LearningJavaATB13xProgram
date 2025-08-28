package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("python");
        s1.add("C#");
        s1.add("Java");

        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);

        Stack<Integer> intstack = new Stack();
        intstack.push(23);
        intstack.push(34);
        intstack.push(43);

        System.out.println(intstack);

    }
}
