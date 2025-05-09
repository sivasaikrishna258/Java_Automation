package com.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicateCharactersWithItsRepeatingValue {
    public static void main(String[] args) {
        String s="aacwdncwwdwjc";

        StringBuilder stringBuilder=new StringBuilder();

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for (int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> m:map.entrySet()){
            stringBuilder.append(m.getKey()+""+m.getValue());
        }

        System.out.println(stringBuilder);
    }
}
