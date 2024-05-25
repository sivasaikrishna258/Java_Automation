package com.interview;

public class Arrays {

	public static void main(String[] args) {

		int a[]= {1,3,4};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]);
		}
		
	}

}
