package com.interview;

public class ReverseWords {

	public static void main(String[] args) {

		
		String s="siva sai kridhna";
		
		String rev="";
		String s1[]=s.split("\\s");
		
		for(String  t:s1) {
			
			rev=t+" "+rev;
			
		}
		System.out.println(rev);

}
}