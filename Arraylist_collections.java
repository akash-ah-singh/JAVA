package Chap_15;
import java.util.*;

public class Arraylist_collections {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(10); // add elements in Arraylist l2 .
        l2.add(11);
        l2.add(12);


        l1.add(4); // add elements in Arraylist l1 .
        l1.add(5);
        l1.add(6);
        l1.add(5);
        l1.add(8);
        l1.add(0,10); // at element at index 0 in Arraylist l1 .

        l1.remove(0); // remove element at index 0 from Arraylist l1 .

        l1.set(0,5); // Replaces the element at the specified position in this Arraylist with the specified element.
        System.out.println(l1);

        System.out.println(l1.indexOf(5)); //Gives first index No. of element 5 from arrayList l1 .
        System.out.println(l1.indexOf(45)); // if element index not found in Arraylist l1 , it returns -1 .
        System.out.println(l1.lastIndexOf(5)); // Gives Last index No. of element 5 from ArrayList l1 .



        System.out.println(l1.contains(8)); // return true ,because element found in the Arraylist l1 .
        System.out.println(l1.contains(81)); // return false ,because element found in the Arraylist l1 .


       // l1.addAll(l2); // add l2 elements at last in l1 Arraylist.
       // System.out.println(l1);
       // l1.addAll(0,l2); // add l2 elements from starting in l1 Arraylist.



//        for (int i = 0; i <l1.size() ; i++) {
//            System.out.println(l1.get(i)); // print Arraylist l1 in sequential order.
//
//        }

        System.out.println(l1); // print Arraylist l1 in form of array.

        l1.clone(); // it makes another copy of l1 Arraylist .
        System.out.println(l1);

        l1.clear(); // clear all the elements from the Arraylist l1 at one GO.
        System.out.println(l1);

        System.out.println(l1.isEmpty()); // return true ,  if the Arraylist l1 is empty Otherwise return false .


    }
}
