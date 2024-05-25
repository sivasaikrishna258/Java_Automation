package com.interview;
//smallest to largest
public class ArrayAssending {

	public static void main(String[] args) {

		int a[]= {1,5,3,4,2};
		int t=0;
		for(int i=0;i<a.length;i++) {
			for(int i1=i+1;i1<a.length;i1++) {
				if(a[i]>a[i1]) {
					t=a[i];
					a[i]=a[i1];
					a[i1]=t;
					
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
