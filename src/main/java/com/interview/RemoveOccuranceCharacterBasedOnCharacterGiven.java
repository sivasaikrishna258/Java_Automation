package com.interview;

public class RemoveOccuranceCharacterBasedOnCharacterGiven {

	public static void main(String[] args) {

		String s="sivasai";
		char c='s';
		StringBuilder str=new StringBuilder(s);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				str.deleteCharAt(i);
				
			}
		}
		System.out.println(str);
	}

}
