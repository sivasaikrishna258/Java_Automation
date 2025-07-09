package com.InterviewQueWithCollectionFramework.collectionFramework;

import java.util.HashMap;
import java.util.Map;

//hashtable definition --->
// A hashtable is a data structure that implements an associative array abstract data type, a structure that can map keys to values.
// In hashtable, keys are unique and each key is associated with a value.
// A hashtable uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.

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
/**
 * | Class           | Description**                                                                    |
 * | --------------- | ---------------------------------------------------------------------------------- |
 * | `HashMap`       | Implements `Map`. Does not maintain any order of keys or values.               |
 * | `LinkedHashMap` | Implements `Map`, extends `HashMap`. Maintains insertion order.                |
 * | `TreeMap`       | Implements `Map` and `SortedMap`. Maintains keys in natural (ascending) order. |
 */