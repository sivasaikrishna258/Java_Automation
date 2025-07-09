package com.InterviewQueWithCollectionFramework.stringPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * | Method                                    | Description                                                                |
 * | ----------------------------------------- | -------------------------------------------------------------------------- |
 * | `append(String str)`                      | Appends the specified string to this character sequence.                   |
 * | `insert(int offset, String str)`          | Inserts the string into this character sequence at the specified position. |
 * | `replace(int start, int end, String str)` | Replaces characters from `start` to `end` with the given string.           |
 * | `delete(int start, int end)`              | Removes characters from the sequence from `start` to `end`.                |
 * | `deleteCharAt(int index)`                 | Removes the character at the specified index.                              |
 * | `reverse()`                               | Reverses the current string.                                               |
 * | `length()`                                | Returns the number of characters in the sequence.                          |
 * | `capacity()`                              | Returns the current capacity of the buffer.                                |
 * | `charAt(int index)`                       | Returns the character at the specified index.                              |
 * | `setCharAt(int index, char ch)`           | Sets the character at the specified index.                                 |
 * | `substring(int start)`                    | Returns a substring starting from the specified index.                     |
 * | `substring(int start, int end)`           | Returns a substring from `start` to `end`.                                 |
 * | `toString()`                              | Converts the StringBuffer to a string.                                     |
 */
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
