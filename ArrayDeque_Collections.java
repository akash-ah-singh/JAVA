package Chap_15;
import java.util.*;
public class ArrayDeque_Collections {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq1=new ArrayDeque<>();
        dq1.add(4);
        dq1.add(5);
        dq1.add(6);
        dq1.addFirst(1); // add element at first index of ArrayDeque dq1 .
        dq1.addLast(7); // add element at last index of ArrayDeque dq1 .

        System.out.println(dq1);
        System.out.println(dq1.getFirst()); // gives element of first index of ArrayDeque dq1 .
        System.out.println(dq1.getLast()); // gives element of last index of ArrayDeque dq1 .

        // there are Some methods of ArrayList and LinkedList which is also applied in ArrayDeque .


    }
}
