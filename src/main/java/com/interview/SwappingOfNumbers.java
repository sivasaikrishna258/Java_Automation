package com.interview;

public class SwappingOfNumbers {

	public static void main(String[] args) {

		int a=10,b=20,temp;
		
		//using third variable
		System.out.println(a+" "+b);
		temp=a;
		a=b;
		b=temp;
		
		//without using third variable
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		
		
		System.out.println(a+" "+b);
		
	}

}
