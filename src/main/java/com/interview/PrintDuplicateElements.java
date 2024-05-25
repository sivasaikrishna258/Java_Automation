package com.interview;

public class PrintDuplicateElements {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,2,7,8,8,3,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
			
		}
		
		//print array elements in reverse array
//		System.out.print("reverse array ");
//		for(int i=a.length-1;i<=a.length;i--) {
//			System.out.print(" "+a[i]);
//		}
	}

}
