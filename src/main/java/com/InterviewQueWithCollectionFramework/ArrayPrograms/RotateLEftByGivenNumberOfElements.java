package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class RotateLEftByGivenNumberOfElements {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        int steps=2;
        int first;
        for(int i=0;i<steps;i++){
            first=a[0];
            int j;
            for ( j=0;j<a.length-1;j++){ //j<4
                a[j]=a[j+1];
            }
            a[j]=first;
        }

        for
        (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
