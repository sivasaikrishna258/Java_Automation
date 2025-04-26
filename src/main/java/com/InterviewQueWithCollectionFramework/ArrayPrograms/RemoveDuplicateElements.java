package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int a[]=new int[]{2,2,3,4,5,5,6,6};

        for (int i=0;i<a.length;i++){
            int count=1;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    count++;
                    break;
                }
            }

            if(count==1){
                System.out.println(a[i]);
            }
        }
    }
}
