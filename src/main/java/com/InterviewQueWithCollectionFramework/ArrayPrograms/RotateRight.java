package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class RotateRight {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5};
        int steps = 2;
        int last;

        for(int i=0;i<steps;i++){
            int j;
            last=a[a.length-1];

            for(j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[j]=last;
        }
        for
        (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
