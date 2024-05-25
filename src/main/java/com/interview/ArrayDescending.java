package com.interview;
//largest to smallest
public class ArrayDescending {

	public static void main(String[] args) {

		int a[]= {3,2,4,1};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<b.length;j++){
				
				if(a[i]<a[j]) {
					b[i]=a[i];
					a[i]=a[j];
					a[j]=b[i];
				}
			}
		}
		for(int c:a)
		System.out.println(c);
	}

}
