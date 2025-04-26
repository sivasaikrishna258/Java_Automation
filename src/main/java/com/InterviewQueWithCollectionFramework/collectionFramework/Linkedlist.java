package com.InterviewQueWithCollectionFramework.collectionFramework;

import java.util.LinkedList;
import java.util.List;

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
