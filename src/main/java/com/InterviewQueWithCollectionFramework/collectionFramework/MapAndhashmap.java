package com.InterviewQueWithCollectionFramework.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapAndhashmap {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();

        map.put(1,2);
        map.put(3,4);
        map.put(1,4);// when we try add duplicate key it will replace corresponding value with latest

        System.out.println(map.get(1));

        Map<String,String> empDetails=new HashMap<>();

        empDetails.put("Name","siva");
        empDetails.put("Age","26");
        for (Map.Entry e:empDetails.entrySet()) {
            System.out.println(e.getKey()+"= "+e.getValue());
        }
    }
}
