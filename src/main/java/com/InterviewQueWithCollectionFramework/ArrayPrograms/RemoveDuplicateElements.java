package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int a[]=new int[]{2,2,3,3,1,4,5,5,6,6};

        for (int i=0;i<a.length;i++){
            int count=1;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]='0';
                    break;
                }
            }

            if(a[i]!='0'){
                System.out.println(a[i]);
            }
        }
    }
}
