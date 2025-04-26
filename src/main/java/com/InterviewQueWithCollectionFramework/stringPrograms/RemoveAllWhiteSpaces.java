package com.InterviewQueWithCollectionFramework.stringPrograms;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String s="siva sai krishna";

        s=s.replaceAll("\\s+","");
        System.out.println(s);
    }
}
