package com.InterviewQueWithCollectionFramework.stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersAndWords {
    public static void main(String[] args) {

        //print duplicate characters
        String s="sivasaikk";

        s=s.toLowerCase();

        HashMap<Character,Integer> characters=new HashMap<>();

        for (char c:s.toCharArray()){
            characters.put(c,characters.getOrDefault(c,0)+1);
        }

        System.out.println("Duplicate characters in string are ");
        for (Map.Entry<Character,Integer> characterIntegerEntry:characters.entrySet()){
            if(characterIntegerEntry.getValue()>1){
                System.out.println(characterIntegerEntry.getKey());
            }
        }

        //print duplicate words
        String s1="siva Sai krishna sai krishna";
        HashMap<String,Integer> wordsMap=new HashMap<>();

        s1=s1.toLowerCase();
        String[] words = s1.split(" ");
        for (int i=0;i<words.length;i++){
            wordsMap.put(words[i],wordsMap.getOrDefault(words[i],0)+1);
        }
        System.out.println("Duplicate words in string are ");
        for (Map.Entry<String,Integer> word:wordsMap.entrySet()){
            if(word.getValue()>1){
                System.out.println(word.getKey()+" "+word.getValue());
            }
        }


    }
}
