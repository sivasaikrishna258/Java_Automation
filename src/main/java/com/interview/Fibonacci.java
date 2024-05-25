package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=0;i<5;i++) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(" "+c);
		}
		
		
	}

}
