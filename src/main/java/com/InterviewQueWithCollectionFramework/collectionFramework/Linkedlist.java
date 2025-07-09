package com.InterviewQueWithCollectionFramework.collectionFramework;

import java.util.LinkedList;
import java.util.List;

/**
 * def: A LinkedList is a data structure that consists of a sequence of elements, where each element points to the next one.
 * It allows for efficient insertion and removal of elements from any position in the list.
 * It is part of the Java Collections Framework and implements the List interface.
 * It can store elements of any type, including objects, and allows for duplicate elements.
 * It provides methods for adding, removing, and accessing elements, as well as for traversing the list.
 * It is commonly used for implementing data structures like stacks, queues, and deques.
    * It is not synchronized, meaning it is not thread-safe by default.
 * insertion order is maintained, meaning the order of elements is the same as the order in which they were added.
 */
public class Linkedlist {
    public static void main(String[] args) {
        List<String> ls=new LinkedList<>();

        ls.add("siva");
        ls.add("sai");

        System.out.println("After adding\n"+ ls);

        ls.remove("sai");

        System.out.println("After removing\n"+ ls);

        ls.add(0,"krishna");

        System.out.println("After adding element at 0th position\n"+ ls);

        ls.add(0,"Advanapu");

        System.out.println("After adding another element at 0th position\n"+ ls);
    }
}
