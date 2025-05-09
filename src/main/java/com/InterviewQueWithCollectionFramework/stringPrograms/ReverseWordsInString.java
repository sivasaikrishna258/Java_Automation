package com.InterviewQueWithCollectionFramework.stringPrograms;

public class ReverseWordsInString {
    public static void main(String[] args) {

        //string reverse
        String s = "sivasai";
        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }

        System.out.println(rev);


        //words reverse using normal
        String str = "siva sai krishna";
        String r = "";
        String[] s1 = str.split(" ");

        for (int i = 0; i < s1.length; i++) {
            r = s1[i] +" " + r;
        }

        System.out.println(r);


        //words reverse using string builder

        StringBuilder reverseString=new StringBuilder();
        for (int i = 0; i < s1.length; i++) {

            reverseString.insert(0,s1[i]+" ");
        }

        System.out.println(reverseString);

        }
}
