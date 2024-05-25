package com.interview;

public class NumberPalindrome {

	public static void main(String[] args) {

		int r,temp, sum=0,n=313;
		temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		System.out.println(temp);
		if(sum==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
