package com.interview;

public class CountVowelsAndConsonenets {

	public static void main(String[] args) {

		String s="sisdkdnska";
		int v=0 , c=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') {
			v++;
			}else {
				c++;
			}
		}
		
		System.out.println("total vowels :"+v);
		System.out.println("total consonents :"+c);

	}

}
