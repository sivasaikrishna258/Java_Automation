package com.interview;

public class CountTotalNumberOfCharactersInString {

	public static void main(String[] args) {

		String s="sis dkdnska ";
		int c=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
			c++;
			}
		}
		System.out.println(c);
	}

}
