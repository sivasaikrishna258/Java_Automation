package com.InterviewQueWithCollectionFramework.stringPrograms;

public class SwappingTwoStringsWithootUsingThirdVariable {
    public static void main(String[] args) {
        String s1="sivasai";
        String s2="sai";

        String s3=s1+s2;

        s2=s3.substring(0,(s3.length()-s2.length()));
        s1=s3.substring(s1.length()); //in substring method if we dont provide the end index it will take it as string length automatically

        System.out.println(s1 +"\n"+s2);


        //without using third variable
        String s="siva", s4 ="sai";
        s= s + s4;
        s4 =s.substring(0, s.length() - s4.length());
        s=s.substring(s4.length());
        System.out.println(s);
    }
}
