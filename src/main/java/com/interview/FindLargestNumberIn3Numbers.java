package com.interview;

public class FindLargestNumberIn3Numbers {

	public static void main(String[] args) {

		int a=29,b=10,c=120;
		
		if(a>b&&a>c) {
			System.out.println("a is great");
		}else if(b>a&&b>c) {
			System.out.println("b is great");

		}else {
			System.out.println("c is great");

		}
//		int t=a<b?a:b;
//		int c1=t<c?t:c;
//		
//		int t1=a>b?a:b;
//		int c2=t1>c?t1:c;
//		
//		System.out.println("largest number "+ c2);
//		System.out.println("smallest number "+c1);
	}

}
