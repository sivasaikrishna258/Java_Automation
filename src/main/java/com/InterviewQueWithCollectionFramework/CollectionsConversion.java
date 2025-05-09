package com.InterviewQueWithCollectionFramework;

import java.util.*;

public class CollectionsConversion {
    public static void main(String[] args) {

        //list to set
        ArrayList<String> ls=new ArrayList<>();
        ls.add("siva");
        ls.add("sai");
        System.out.println("arraylist :"+ ls);
        Set<String> s=new HashSet<>(ls);
        System.out.println(s);

        //set to list
        Set<String> s1=new HashSet<>();
        s1.add("sai");
        s1.add("krishna");
        System.out.println("Set values "+s1);
        List<String> l=new ArrayList<>(s1);
        System.out.println("accesing the element based on the index" +l.get(0));

        //map to list

        Map<String,Integer> map=new HashMap<>();
        map.put("siva",1);
        map.put("sai",2);
        map.put("krishna",3);

        //we have 2 ways to conver 1.get the keys only
        ArrayList<String> a=new ArrayList<>(map.keySet());
        System.out.println("keys from map in arrayList "+a);

        //2.get the values
        ArrayList<Integer> a1=new ArrayList<>(map.values());
        System.out.println("values from map in arraylist "+a1);


    }


}
