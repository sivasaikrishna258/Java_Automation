package com.interview;

public class LargestNumberInArray {

	public static void main(String[] args) {

	
		int a[]={13,45,67};
		int n=a.length;
		int b[]=new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					    b[i] = a[i];  
	                    a[i] = a[j];  
	                    a[j] = b[i];  				}
			}
		}
		for(int c:a) {
		System.out.println(c);
		}
		System.out.println(a[0]);
	}

}
