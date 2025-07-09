package com.InterviewQueWithCollectionFramework.comparableAndComparator;

import java.util.Arrays;
import java.util.List;

public class SortingStrings {
    public static void main(String[] args) {


    //sorting of above without using any inbuilt methods

    String[] fruits = {"Banana", "Apple", "Mango", "Orange", "Grapes", "Pineapple", "Kiwi"};


        for (int i = 0; i < fruits.length - 1; i++) {
        for (int j = i + 1; j < fruits.length; j++) {
            // Compare using compareTo (lexicographical comparison)
            if (fruits[i].compareTo(fruits[j]) > 0) {
                // Swap
                String temp = fruits[i];
                fruits[i] = fruits[j];
                fruits[j] = temp;
            }
        }
        }
        System.out.println("Sorted Strings:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        List<String> s=Arrays.asList(fruits);
        System.out.println(s);
    }
}
