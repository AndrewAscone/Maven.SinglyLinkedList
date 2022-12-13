package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(30);
        sll.add(40);
        sll.add(10);
        sll.add(20);

//        System.out.println(sll.toString());
//        System.out.println(sll.find(10));
//
//        SinglyLinkedList newSll = sll.copy();
//        System.out.println("The copied list: " + newSll.toString());
//
//        sll.remove(3);
//        System.out.println(sll.toString());

        System.out.println(sll.sort().toString());
    }
}
