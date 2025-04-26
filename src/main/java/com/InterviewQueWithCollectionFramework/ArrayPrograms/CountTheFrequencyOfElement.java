package com.InterviewQueWithCollectionFramework.ArrayPrograms;

public class CountTheFrequencyOfElement {
    public static void main(String[] args) {
        int a[]=new int[]{2,3,3,1,2,8,9,8};
        int count;
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){

                if(a[i]==a[j]){
                    count++;

                    a[j]=0;
                    break;
                }
            }
            if(count>=1 && a[i]!=0){
                System.out.println(a[i]+" "+count);
            }
        }
    }
}
