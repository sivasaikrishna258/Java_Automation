package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class AscendingAndDescendingOrder {
    public static void main(String[] args) {

        //Ascending order
        int a[] = new int[]{4, 1, 2, 7};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //Descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
