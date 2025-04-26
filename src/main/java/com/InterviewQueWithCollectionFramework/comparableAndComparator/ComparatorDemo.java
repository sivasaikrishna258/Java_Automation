package com.InterviewQueWithCollectionFramework.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.example.comparableAndComparator.Comparing.byName;

public class ComparatorDemo {
    public static void main(String[] args) {

        Students students=new Students("siva",27);
        Students students1=new Students("saiKrishna",8);

        List<Students> ls=new ArrayList<>();
        ls.add(students);
        ls.add(students1);


        Collections.sort(ls,byName);
        System.out.println(ls);
    }
}
