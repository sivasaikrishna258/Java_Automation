package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class CopyingElementsFromOneToAnotherArray {

    public static void main(String[] args) {
        int a[]= {1,6,7};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }


    }
}
