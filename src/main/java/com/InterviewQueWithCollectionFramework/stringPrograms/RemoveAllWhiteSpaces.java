package com.InterviewQueWithCollectionFramework.stringPrograms;

/**
 * | **Regex**   | **Matches**                            | **Example**                                          |
 * | ----------- | -------------------------------------- | ---------------------------------------------------- |
 * | `"\\d"`     | Any digit (0–9)                        | `"abc123".replaceAll("\\d", "*") → "abc***"`         |
 * | `"\\D"`     | Any non-digit                          | `"123abc".replaceAll("\\D", "") → "123"`             |
 * | `"\\w"`     | Any word character (a-z, A-Z, 0-9, \_) | `"hi@#1".replaceAll("\\w", "-") → "--@#-"`           |
 * | `"\\W"`     | Any non-word character                 | `"hello@world".replaceAll("\\W", "") → "helloworld"` |
 * | `"\\s"`     | Whitespace (space, tab, newline)       | `"a b\tc".replaceAll("\\s", "") → "abc"`             |
 * | `"\\S"`     | Non-whitespace                         | `"a b".replaceAll("\\S", "*") → "* *"`               |
 * | `"."`       | Any character (except newline)         | `"abc".replaceAll(".", "*") → "***"`                 |
 * | `"^abc"`    | "abc" at the start of string           | `"abc123".replaceAll("^abc", "xyz") → "xyz123"`      |
 * | `"abc$"`    | "abc" at the end of string             | `"123abc".replaceAll("abc$", "xyz") → "123xyz"`      |
 * | `"a+"`      | One or more 'a'                        | `"baaaac".replaceAll("a+", "x") → "bxc"`             |
 * | `"[aeiou]"` | Any vowel                              | `"hello".replaceAll("[aeiou]", "*") → "h*ll*"`       |
 * | `"[^0-9]"`  | Anything except digits                 | `"a1b2".replaceAll("[^0-9]", "") → "12"`             |
 */
public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String s="siva sai krishna";

        s=s.replaceAll("\\s+","");
        System.out.println(s);
    }
}
