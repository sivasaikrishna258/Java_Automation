package com.InterviewQueWithCollectionFramework.stringPrograms;

/**
 * One of the approach to find smallest and largest word is to split string into words then,
 * compare length of each word with variables small and large. If length of a word is less than length of small then, store that word in small.
 * If length of a word is greater than length of large then, store that word in large.
 */
public class FindSmallestAndLargestWordInString {
    public static void main(String[] args) {
        String s="thw worls is much more beautuful that the prevoius attempt don't know why.do u have any idea.";

        String[] s1 = s.split(" ");

        String small ,large;
        small=large=s1[0];
        for(int i=0;i<s1.length;i++){

            if (s1[i].length()<small.length()){
                small=s1[i];
            }else if(s1[i].length()>large.length()) {
                large=s1[i];
            }
        }

        System.out.println("largest word in an array is : "+ large);
        System.out.println("smallest word in an array is : "+small);
    }
}
