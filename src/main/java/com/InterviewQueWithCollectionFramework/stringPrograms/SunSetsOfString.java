package com.InterviewQueWithCollectionFramework.stringPrograms;

/**
 * The subset of a string is the character or the group of characters that are present inside the string.
 * <p>
 * All the possible subsets for a string will be n(n+1)/2.
 * <p>
 * For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
 */
public class SunSetsOfString {
    public static void main(String[] args) {
        String s = "FUN";
        String a[] = new String[s.length() * (s.length() + 1) / 2];
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                a[t] = s.substring(i, j+1);
                t++;
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(a[i]);
        }
    }
}
