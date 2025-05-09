package com.InterviewQueWithCollectionFramework.stringPrograms;
/**
 *  One of the approach to accomplish this task is split the string into word.
 *  Then, check whether the words are palindrome or not.
 *  Then, compare their length to find out the minimum and maximum palindromic word.
 */
public class SmallestAndLargestPalindrome {
    public static void main(String[] args) {
        String s="siva unu  ashsa";

        String word="";
        String[] s1 = s.split(" ");


        StringBuilder reverse=new StringBuilder();
        for (int i=0;i< s1.length;i++){

            word=s1[i];
            String rev="";

            for (int j=0;j<word.length();j++){
                rev=word.charAt(j)+rev;
            }

            if (rev.equalsIgnoreCase(word)){
                System.out.println(word+ "palindrome");
                reverse.append(word+" ");
            }

        }

        String[] s2 = reverse.toString().split(" ");

        String small ,large;
        small=large=s2[0];
        for(int i=0;i<s2.length;i++){

            if (s2[i].length()<small.length()){
                small=s2[i];
            }else if(s2[i].length()>large.length()) {
                large=s2[i];
            }
        }

        System.out.println("largest palindrome word in an array is : "+ large);
        System.out.println("smallest palindrome word in an array is : "+small);
        System.out.println(s2[0]);

    }
}
