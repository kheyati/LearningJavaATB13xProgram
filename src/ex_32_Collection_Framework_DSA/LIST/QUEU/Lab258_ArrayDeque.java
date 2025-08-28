package ex_32_Collection_Framework_DSA.LIST.QUEU;

import java.util.ArrayDeque;
import java.util.Queue;

public class Lab258_ArrayDeque {
    public static void main(String[] args) {
        Queue queue = new ArrayDeque();
        queue.add("1234");
        queue.add("ABCD");
        queue.add("XYZ");

        System.out.println(queue);
    }
}
