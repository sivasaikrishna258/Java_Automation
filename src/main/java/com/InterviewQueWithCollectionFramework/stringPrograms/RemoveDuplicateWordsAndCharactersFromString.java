package com.InterviewQueWithCollectionFramework.stringPrograms;

import java.util.*;

public class RemoveDuplicateWordsAndCharactersFromString {
    public static void main(String[] args) {

        String s="advanapu siva hi sai sai krishna advanapu";
        String[] s1 = s.split(" ");
        LinkedHashMap<String, Integer> map=new LinkedHashMap<>();

        //it is a one way to do
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        for (Map.Entry<String,Integer> m: map.entrySet()){
            str.append(m.getKey()+ " ");
//            System.out.println(m.getKey()+" ");
        }


        System.out.println(str);
    }
}
