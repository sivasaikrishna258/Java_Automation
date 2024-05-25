package com.interview;

public class FactorialNumber {

	public static void main(String[] args) {

//		int n=0,fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
		int f=1;
		 f=factorial(5);
		System.out.println(f);
		
		
	}
	
	 static int  factorial(int n) {
		
		return (n*factorial(n-1));
		
	}
	

}
