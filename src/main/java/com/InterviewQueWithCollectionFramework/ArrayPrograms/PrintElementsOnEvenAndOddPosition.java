package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class PrintElementsOnEvenAndOddPosition {
    public static void main(String[] args) {
        int a[]=new int[]{3,1,3,5,6};

        for(int i=0;i<a.length;i++){

            if(i%2==0){
                System.out.println("even"+a[i]);
            }else {
                System.out.println(a[i]);
            }
        }
//        int sum=0;
//        for(int i=0;i<a.length;i++){
//            sum=sum+a[i];
//        }
//        System.out.println(sum);
    }
}
