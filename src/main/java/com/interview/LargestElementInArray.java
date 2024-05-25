package com.interview;

public class LargestElementInArray {

	public static void main(String[] args) {

		int a[]= {10,4,53,6,3};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("maximum number in array :"+ max);
		
		System.out.println("Minimum number in array :"+ min);
	}

}
