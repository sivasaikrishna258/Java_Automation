package com.InterviewQueWithCollectionFramework.stringPrograms;

public class StringAnagram {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        boolean flag=true;
        String str1 = "listenn";
        String str2 = "silentt";

        if (str1.length() != str2.length()) {
//            System.out.println("Not anagrams");
            flag= false;
        }

        for(int i=0;i<str1.length();i++){
            char c= str1.charAt(i);

            int count1=charCount(str1,c);
            int count2=charCount(str2,c);

            if (count1 != count2){
                flag=false;
                break;
            }
        }

        if (flag==true){
            System.out.println("anagram");
        } else{
            System.out.println("not anagram");

        }
    }

    private static int charCount(String str, char c) {
        int count=0;

        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}
