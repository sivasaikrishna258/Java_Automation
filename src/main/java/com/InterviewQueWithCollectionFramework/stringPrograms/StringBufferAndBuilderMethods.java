package com.InterviewQueWithCollectionFramework.stringPrograms;

//both StringBuffer and StringBuilder are used to create mutable strings
//they are same but StringBuffer is synchronized and StringBuilder is not synchronized
/** ✅ StringBuilder Class Methods

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

/** StringBuffer class methods
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

 *
 */
public class StringBufferAndBuilderMethods {

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
