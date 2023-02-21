package Chap_15;

import java.util.*;

public class linkedlist_collection {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(10); // add elements in LinkedList l2 .
        l2.add(11);
        l2.add(12);


        l1.add(4); // add elements in LinkedList l1 .
        l1.add(5);
        l1.add(6);
        l1.add(5);
        l1.add(8);
        l1.add(0,10); // at element at index 0 in LinkedList l1 .
        System.out.println(l1);

        l1.remove(0); // remove element at index 0 from LinkedList l1 .
        System.out.println(l1);

        l1.set(0,5); // Replaces the element at the specified position in this LinkedList with the specified element.
        System.out.println(l1);

        System.out.println(l1.indexOf(5)); //Gives first index No. of element 5 from LinkedList l1 .
        System.out.println(l1.indexOf(45)); // if element index not found in LinkedList l1 , it returns -1 .
        System.out.println(l1.lastIndexOf(5)); // Gives Last index No. of element 5 from LinkedList l1 .



        System.out.println(l1.contains(8)); // return true ,because element found in the LinkedList l1 .
        System.out.println(l1.contains(81)); // return false ,because element found in the LinkedList l1 .


        // l1.addAll(l2); // add l2 elements at last in l1 LinkedList.
        // System.out.println(l1);
        // l1.addAll(0,l2); // add l2 elements from starting in l1 LinkedList.



//        for (int i = 0; i <l1.size() ; i++) {
//            System.out.println(l1.get(i)); // print LinkedList l1 in sequential order.
//
//        }

        System.out.println(l1); // print LinkedList l1 in form of array.

        l1.clone(); // it makes another copy of l1 LinkedList .
        System.out.println(l1);

        l1.clear(); // clear all the elements from the LinkedList l1 at one GO.
        System.out.println(l1);

        System.out.println(l1.isEmpty()); // return true ,  if the LinkedList l1 is empty Otherwise return false .

        l1.addFirst(555); //add Element at first Index of LinkedList
        System.out.println(l1);

        l1.addLast(666); // add Element at last Index of LinkedList
        System.out.println(l1);
    }
}
