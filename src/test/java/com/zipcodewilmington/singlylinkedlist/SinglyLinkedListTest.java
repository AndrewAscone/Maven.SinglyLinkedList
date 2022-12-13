package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        int expected = 3;
        int actual = test.getSize();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getValueTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        int expected = 20;
        int actual = test.getValue(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        Assertions.assertTrue(test.contains(30));
    }

    @Test
    public void findTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        int expected = 0;
        int actual = test.find(10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void copyTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        SinglyLinkedList copy = test.copy();

        int expected = 3;
        int actual = copy.getSize();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        test.remove(1);

        int expected = 30;
        int actual = test.getValue(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sortTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(40);
        test.add(20);
        test.add(50);
        test.add(30);

        test.sort();

        int expected = 40;
        int actual = test.getValue(3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        String expected = "10, 20, 30";
        String actual = test.toString();

        Assertions.assertEquals(expected, actual);
    }
}
