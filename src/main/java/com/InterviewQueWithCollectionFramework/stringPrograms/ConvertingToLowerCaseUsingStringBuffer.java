package com.InterviewQueWithCollectionFramework.stringPrograms;

public class ConvertingToLowerCaseUsingStringBuffer {
    public static void main(String[] args) {
        String s="Sivasai";
        StringBuffer b=new StringBuffer(s);

        //converting to lowercase with inbuilt methods
        s=s.toLowerCase();
        System.out.println(s);

        //converting to uppercase
        for (int i=0;i<s.length();i++){
            if (Character.isLowerCase(s.charAt(i))){
                b.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
        }
        System.out.println(b);

        String s1="Sivasai";
        StringBuffer b1=new StringBuffer(s1);
        //converting to lowercase
        for (int i=0;i<s1.length();i++){
            if (Character.isUpperCase(s1.charAt(i))){
                b1.setCharAt(i,Character.toLowerCase(s1.charAt(i)));
            }
        }
        System.out.println(b1);
    }
}
