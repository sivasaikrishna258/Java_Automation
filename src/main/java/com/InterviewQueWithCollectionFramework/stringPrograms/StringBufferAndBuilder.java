package com.InterviewQueWithCollectionFramework.stringPrograms;

/**
 * | **Method**                            | **Description**                                              | **Example**                 |
 * | ------------------------------------- | ------------------------------------------------------------ | --------------------------- |
 * | `append(String str)`                  | Adds a string (or any value) to the end of the buffer.       | `sb.append(" World")`       |
 * | `insert(int offset, String str)`      | Inserts a string at the specified position.                  | `sb.insert(5, ",")`         |
 * | `replace(int start, int end, String)` | Replaces characters from `start` to `end` with a new string. | `sb.replace(6, 11, "Java")` |
 * | `delete(int start, int end)`          | Removes characters between the given indices.                | `sb.delete(5, 6)`           |
 * | `reverse()`                           | Reverses the character sequence.                             | `sb.reverse()`              |
 * | `toString()`                          | Converts the buffer to a standard `String`.                  | `sb.toString()`             |
 * | `capacity()`                          | Returns current buffer capacity (storage size).              | `sb.capacity()`             |
 * | `ensureCapacity(int capacity)`        | Ensures the buffer has at least the given capacity.          | `sb.ensureCapacity(50)`     |
 * | `length()`                            | Returns the number of characters in the buffer.              | `sb.length()`               |
 * | `charAt(int index)`                   | Returns the character at the specified index.                | `sb.charAt(0)`              |
 * | `setCharAt(int index, char ch)`       | Sets the character at the given index.                       | `sb.setCharAt(0, 'h')`      |
 * | `substring(int start)`                | Returns substring from `start` to end.                       | `sb.substring(6)`           |
 * | `substring(int start, int end)`       | Returns substring from `start` to `end - 1`.                 | `sb.substring(0, 5)`        |
 */
public class StringBufferAndBuilder {

    public static void main(String[] args) {

        StringBuffer s=new StringBuffer();

        s.append("siva");
        s.append("sai");
        System.out.println(s);

        //convert stringBuffer to string is done using toString() method
        String str=s.toString();
        System.out.println("mormal string is "+ str);

        //convert stringbuffer to string[] is performed by split method


    }
}
