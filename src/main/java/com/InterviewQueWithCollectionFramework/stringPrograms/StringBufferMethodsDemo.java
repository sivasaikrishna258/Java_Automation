package com.InterviewQueWithCollectionFramework.stringPrograms;

/**
 | Method                                    | Description                                                                |
 | ----------------------------------------- | -------------------------------------------------------------------------- |
 | `append(String str)`                      | Appends the specified string to this character sequence.                   |
 | `insert(int offset, String str)`          | Inserts the string into this character sequence at the specified position. |
 | `replace(int start, int end, String str)` | Replaces characters from `start` to `end` with the given string.           |
 | `delete(int start, int end)`              | Removes characters from the sequence from `start` to `end`.                |
 | `deleteCharAt(int index)`                 | Removes the character at the specified index.                              |
 | `reverse()`                               | Reverses the current string.                                               |
 | `length()`                                | Returns the number of characters in the sequence.                          |
 | `capacity()`                              | Returns the current capacity of the buffer.                                |
 | `charAt(int index)`                       | Returns the character at the specified index.                              |
 | `setCharAt(int index, char ch)`           | Sets the character at the specified index.                                 |
 | `substring(int start)`                    | Returns a substring starting from the specified index.                     |
 | `substring(int start, int end)`           | Returns a substring from `start` to `end`.                                 |
 | `toString()`                              | Converts the StringBuffer to a string.                                     |

 */
public class StringBufferMethodsDemo {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();

        //append
        s.append("siva");
        System.out.println("after adding "+ s);

        //insert
        s.insert(0,"advanapu"+" ");
        System.out.println("after adding string at 0th index "+s);

        //setCharAt(index)
        s.setCharAt(0,'c');
        System.out.println("after adding character at 0th index "+s);

         //delete()
        s.delete(0,1);
        System.out.println("after removing the characters from 0th index to 1st index "+s);

        s.deleteCharAt(0);
        System.out.println("after removing the character based on given index "+s);

        s.insert(0,"ad");
        System.out.println("after adding the missing string on 0th index "+s);

    }
}
