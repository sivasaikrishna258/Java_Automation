package com.InterviewQueWithCollectionFramework.stringPrograms;

public class StringMethods {

    /**
     * | **Method**                                     | **Description**                                      | **Example**                                  |
     * | ---------------------------------------------- | ---------------------------------------------------- | -------------------------------------------- |
     * | `length()`                                     | Returns the number of characters in the string.      | `"Java".length()` → `4`                      |
     * | `charAt(int index)`                            | Returns the character at the specified index.        | `"Java".charAt(1)` → `'a'`                   |
     * | `substring(int start)`                         | Returns substring from start to end.                 | `"Java".substring(1)` → `"ava"`              |
     * | `substring(int start, int end)`                | Returns substring from start to end - 1.             | `"Java".substring(1, 3)` → `"av"`            |
     * | `equals(String another)`                       | Compares strings (case-sensitive).                   | `"Java".equals("java")` → `false`            |
     * | `equalsIgnoreCase(String another)`             | Compares strings ignoring case.                      | `"Java".equalsIgnoreCase("java")` → `true`   |
     * | `compareTo(String another)`                    | Lexicographically compares strings.                  | `"a".compareTo("b")` → `-1`                  |
     * | `toLowerCase()`                                | Converts all characters to lowercase.                | `"JAVA".toLowerCase()` → `"java"`            |
     * | `toUpperCase()`                                | Converts all characters to uppercase.                | `"java".toUpperCase()` → `"JAVA"`            |
     * | `trim()`                                       | Removes leading and trailing whitespace.             | `"  Java  ".trim()` → `"Java"`               |
     * | `replace(char old, char new)`                  | Replaces all occurrences of a character.             | `"java".replace('a', 'o')` → `"jovo"`        |
     * | `replaceAll(String regex, String replacement)` | Replaces all substrings matching regex.              | `"abc123".replaceAll("\\d", "")` → `"abc"`   |
     * | `contains(CharSequence s)`                     | Checks if string contains the given sequence.        | `"Java".contains("av")` → `true`             |
     * | `startsWith(String prefix)`                    | Checks if string starts with the given prefix.       | `"Java".startsWith("Ja")` → `true`           |
     * | `endsWith(String suffix)`                      | Checks if string ends with the given suffix.         | `"Java".endsWith("va")` → `true`             |
     * | `indexOf(String str)`                          | Returns the first index of the substring.            | `"Java".indexOf("a")` → `1`                  |
     * | `lastIndexOf(String str)`                      | Returns the last index of the substring.             | `"Java".lastIndexOf("a")` → `3`              |
     * | `isEmpty()`                                    | Checks if the string is empty (`length == 0`).       | `"".isEmpty()` → `true`                      |
     * | `split(String regex)`                          | Splits string around matches of regex into an array. | `"a,b,c".split(",")` → `["a", "b", "c"]`     |
     * | `toCharArray()`                                | Converts string to a character array.                | `"Java".toCharArray()` → `['J','a','v','a']` |
     * | `valueOf(any type)`                            | Converts other types to string.                      | `String.valueOf(123)` → `"123"`              |
     * | `join(delimiter, elements...)`                 | Joins elements with the given delimiter.             | `String.join("-", "a", "b")` → `"a-b"`       |
     */
}
