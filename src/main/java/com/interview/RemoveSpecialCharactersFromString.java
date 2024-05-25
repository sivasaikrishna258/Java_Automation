package com.interview;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {

		String s="si  va@123#456";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>64 && s.charAt(i)<122) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		
		
		
	}

}
