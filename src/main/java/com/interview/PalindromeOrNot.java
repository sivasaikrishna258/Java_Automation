package com.interview;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palimdrome");
		}

	}

}
