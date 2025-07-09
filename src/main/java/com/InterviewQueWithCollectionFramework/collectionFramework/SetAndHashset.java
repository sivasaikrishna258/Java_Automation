package com.InterviewQueWithCollectionFramework.collectionFramework;

import java.util.HashSet;
import java.util.*;

public class SetAndHashset {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();


        set.add(4);
        set.add(1);
        set.add(2);


        System.out.println(set);
    }
}
