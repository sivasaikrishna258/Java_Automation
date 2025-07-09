package com.InterviewQueWithCollectionFramework.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();


        ls.add(3);
        ls.add(5);

        System.out.println(ls);

        //for traversing
        Iterator itr = ls.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        Employee e1 = new Employee("siva", 1);
        Employee e2 = new Employee("sai", 4);

        List<Employee> e = new ArrayList<>();

        e.add(e1);
        e.add(e2);

        System.out.println(e.get(0).Name);
        System.out.println(e.get(1).Name);

    }
}
