package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
//		for(int i=0;i<5;i++) {
//			System.out.print(" "+a);
//
//			c=a+b;
//			a=b;
//			b=c;
//
////			System.out.print(" "+c);
//		}

		while(c<=20){
			System.out.print(" "+a);

			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
