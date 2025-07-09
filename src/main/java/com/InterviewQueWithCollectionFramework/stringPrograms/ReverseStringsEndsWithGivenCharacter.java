package com.InterviewQueWithCollectionFramework.stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringsEndsWithGivenCharacter {
    public static void main(String[] args) {

        ArrayList<String> a=new ArrayList<>(Arrays.asList("siva","sai"));

        StringBuilder s=new StringBuilder();

        for(int i=0;i<a.size();i++){
            String s1=a.get(i);
            StringBuilder s2=new StringBuilder();
            if(s1.endsWith("i")){
                s2.reverse();
                s.append(s2+" ");
            }else{
                s.append(s2+" ");
            }
        }
        System.out.println(s);
    }
}
