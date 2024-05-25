package com.interview;

public class SortingArray {

	public static void main(String[] args) {

		int a[]= {1,2,4,7,6};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("largest number :"+a[a.length-1]);
		System.out.println("2nd largest number :"+a[a.length-2]);
		
		System.out.println("smallest number :"+a[0]);
		System.out.println("2nd smallest number :"+a[1]);

	}

}
