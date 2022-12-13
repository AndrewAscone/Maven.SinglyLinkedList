package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    Node head; // A node to hold the start point of the list, the 'head'

    Node tail;

    int length = 0;

    class Node{ //Create an inner class called 'Node' for the Linked List to use
        int data; //Data variable that will hold a number
        Node next; //A Node marker to point to the next Node

        Node(int d){ //Node constructor, Node will hold the int value passed in
            data = d; //Set the data variable to the value passed in
            next = null; //Set the initial next pointer to be null
        }
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(length == 0){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }

        tail = newNode;

        length++;
        //[10,20] [20,30] [30,40] [40, null]
    }

    public Integer getSize(){
        return length;
    }

    public Integer getValue(int index){
        Node temp = head;

        for (int i = 0; i < length; i++) {
            if(i == index){
                return temp.data;
            }
            else{
                temp = temp.next;
            }
        }

        return null;
    }

    public boolean contains(int data){
        Node temp = head;

        for (int i = 0; i < length; i++) {
            if(temp.data == data){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
    }

    public Integer find(int data){
        Node temp = head;

        for (int i = 0; i < length; i++) {
            if(temp.data == data){
                return i;
            }
            else{
                temp = temp.next;
            }
        }
        return -1;
    }

    public SinglyLinkedList copy(){
        Node temp = head;
        SinglyLinkedList newList = new SinglyLinkedList();

        for (int i = 0; i < length; i++) {
            newList.add(temp.data);
            temp = temp.next;
        }

        return newList;
    }

    public void remove(int index){
        Node temp = head;
        Node previous = null;

        if(index == 0){
            head = head.next;
            length--;
        }
        else{
            for (int i = 0; i < length; i++) {
                if(i == index - 1){
                    temp.next = temp.next.next;
                    length--;
                }

                temp = temp.next;
            }
        }
    }

    public SinglyLinkedList sort(){
        Node current = head;
        Node next = current.next;
        boolean changed = false;

        while(!changed) {
            changed = true;
            for (int j = 0; j < length - 1; j++) {
                if(current.data > next.data){
                    int temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                    changed = false;
                }
                current = current.next;
                next = next.next;
            }
            current = head;
            next = current.next;
        }
        return this;
    }




//    //Add element to list
//    public SinglyLinkedList add(SinglyLinkedList list, int data){
//        Node newNode = new Node(data); //Make new node, holds data handed in
//
//        if(list.head == null){ //If the list head is null (i.e. the list is empty)
//            list.head = newNode; //the new node is set as the head
//        }
//        else{
//            Node last = list.head; //Set the 'last' node marker as the head to start
//
//            while(last.next != null){ //While the next node isn't null
//                last = last.next; //Set the 'last' marker to be the next node
//            }
//
//            last.next = newNode; //When the 'last' marker finds null at the next index,
//                                 //change the next value to the new node
//        }
//
//        return list;
//    }
//
//    //Remove element from list by numeric index
//    public SinglyLinkedList remove(SinglyLinkedList list, int index){
//        Node current = list.head; //Set a current Node marker to be equal to the list head
//        Node previous = null; //Set the previous Node marker to start as null
//
//        if(index == 0 && current != null){ //If the index passed in is 0 and current is null
//            list.head = current.next; //Set list head to current next value, which is null
//
//            return list;
//        }
//
//        int count = 0; //Initialize a counter
//
//        while(current != null){ //While the current Node is not null
//            if(count == index){ //If the counter is equal to the index passed in
//                previous.next = current.next; //Set the previous next marker to be the current
//                                              //next marker
//                break;
//            }
//            else{
//                previous = current; //Set previous Node marker to the current marker
//                current = current.next; //Set the current marker to the next marker
//                count++; //Increment counter
//            }
//        }
//
//        if(current == null){ //If the current Node ends up being null from the while loop
//            System.out.println("No element found at index " + index);
//        }
//
//        return list;
//    }
//
//    //Boolean check to see if element is in list
//    public boolean contains(SinglyLinkedList list, int data){
//        Node current = list.head; //Set current Node marker to head of list
//
//        while(current != null){ //While the current Node is not null
//            if(current.data == data){ //If the value in the Current Node equals the value passed in
//                return true;
//            }
//            else{
//                current = current.next; //Set current marker to the next node
//            }
//        }
//
//        System.out.println("List does not contain value " + data);
//
//        return false;
//    }
//
//    //Find and the return the index of an element in the list, return -1 if not found
//    public Integer find(SinglyLinkedList list, int data){
//        Node current = list.head; //Set current Node marker to head of list
//        int count = 0; //Initialize a counter
//
//        while(current != null){ //While current Node is not null
//            if(current.data == data){ //If the data in the current node matches the value passed in
//                return count; //Return the index holding the matching value
//            }
//            else {
//                current = current.next; //Set current node to the next node
//                count++; //Increment counter
//            }
//        }
//        return -1; //If the element is not in the list, the function passes back -1
//    }
//
//    //Return current size of list
//    public Integer size(SinglyLinkedList list){
//        Node current = list.head;
//        int count = 0;
//
//        while(current != null){
//            count++;
//            current = current.next;
//        }
//        return count;
//    }
//
//    //Return the element at an index
//    public Integer get(SinglyLinkedList list, int index){
//        Node current = list.head; //Set current Node marker to head of list
//        int count = 0; //Initialize counter
//
//        while(current != null){ //While current Node is not null
//            if(count == index){ //If the counter equals the index passed in
//                return current.data; //Return the data inside the current Node
//            }
//            else {
//                current = current.next; //Set current node to the next node
//                count++; //Increment counter
//            }
//        }
//        return null;
//    }
//
//    //Make a copy of the list
//    public SinglyLinkedList copy(SinglyLinkedList list){
//        SinglyLinkedList newList = new SinglyLinkedList();
//        Node current = list.head;
//        while(current != null){
//            newList.add(newList, current.data);
//            current = current.next;
//        }
//        return newList;
//    }
//
//    //Sort the list using a bubble sort
//    public SinglyLinkedList sort(){
//
//        return null;
//    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < length; i++) {
            if(temp.next == null){
                sb.append(temp.data);
            }
            else {
                sb.append(temp.data + ", ");
                temp = temp.next;
            }
        }
        return sb.toString();
    }
}
