package com.InterviewQueWithCollectionFramework.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {
    public static void main(String[] args) {
        String s="swiss";

        LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();

        //it is a one way to do
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> m: map.entrySet()){

            if (m.getValue()==1){
                System.out.println(m.getKey());
                break;
            }else{
                System.out.println("there is no non ");
            }
        }
    }
}
