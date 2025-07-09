package com.InterviewQueWithCollectionFramework.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  * ✅ List Interface (e.g., ArrayList, LinkedList)  --->  List allows ordered elements, including duplicates.
 *  | Method                                | Description                                 |
 *  | ------------------------------------- | ------------------------------------------- |
 *  | `add(E e)`                            | Adds an element to the list                 |
 *  | `add(int index, E element)`           | Inserts an element at a specific index      |
 *  | `get(int index)`                      | Returns the element at the specified index  |
 *  | `set(int index, E element)`           | Updates the element at the given index      |
 *  | `remove(int index)`                   | Removes the element at the specified index  |
 *  | `remove(Object o)`                    | Removes the first occurrence of the element |
 *  | `contains(Object o)`                  | Checks if the list contains the element     |
 *  | `size()`                              | Returns the number of elements              |
 *  | `isEmpty()`                           | Checks if the list is empty                 |
 *  | `clear()`                             | Removes all elements from the list          |
 *  | `indexOf(Object o)`                   | Returns index of first occurrence           |
 *  | `lastIndexOf(Object o)`               | Returns index of last occurrence            |
 *  | `subList(int fromIndex, int toIndex)` | Returns a portion of the list               |
 */
public class ListMethodsDemo {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        //add()
        a.add("siva");
        System.out.println("after adding one :"+ a);

        a.add("sai");
        System.out.println("adding element at last :"+ a);

        //add(index,E)
        a.add(0,"krishna");
        System.out.println("adding element at given specified location"+ a);

        //get(index)
        System.out.println("get the element based on specified location :"+ a.get(0));

        //insert(index,E)
        a.set(0,"advanapu");
        System.out.println("arraylist after updating the value in given index with new value"+ a);

        //remove(index)
        a.remove(0);
        System.out.println("after removing element based on given index "+ a);

        //remove(object)
        a.add("sai");
        a.remove("sai");
        System.out.println("removing the first occurance of the element "+ a);

        //contains()
        System.out.println("check element present "+ a.contains("sai"));

        //size()
        System.out.println("size of the lsit "+ a.size());

        //isEmpty()
        System.out.println("check if the element is empty or not "+a.isEmpty());

//        removiIf(condition)
        a.removeIf(name -> name.length()>3);
        System.out.println("removing element based on some condition "+a);

      //clear
        a.clear();
        System.out.println("after clearing the list "+ a);


    }
}
