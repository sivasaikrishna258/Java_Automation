package com.InterviewQueWithCollectionFramework.stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumAndMinimumOccurringCharacter {
    public static void main(String[] args) {

        String s = "sivasaikkk";

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
        }

        Map.Entry<Character, Integer> m2 = characterIntegerMap.entrySet().iterator().next();

//one way to get the first key and value
//        Map.Entry<Character, Integer> m1 = characterIntegerMap.entrySet().iterator().next();
        int max = 0, min = 0;
        char maxC = ' ', minC = ' ';
//        max = min = m1.getValue();
//        maxC = minC = m1.getKey();

        //another way to get the first key and value

        for (Map.Entry<Character, Integer> m : characterIntegerMap.entrySet()) {

            max = min = m.getValue();
            maxC = minC = m.getKey();
            break;
        }

        for (Map.Entry<Character, Integer> m : characterIntegerMap.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                maxC = m.getKey();
            }
            if (m.getValue() < min) {
                min = m.getValue();
                minC = m.getKey();
            }
        }

        System.out.println(maxC + "=" + max + "\n" + minC + "=" + min);
    }
}
