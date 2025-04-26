package com.InterviewQueWithCollectionFramework.stringPrograms;

public class CountNumberOfCharactersINString {
    public static void main(String[] args) {
        String s="Sivasai sai";
        int C=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                C++;
            }
        }
        System.out.println(C++);

    }
}
