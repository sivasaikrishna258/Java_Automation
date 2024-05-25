package com.interview;

public class A {

	public static void main(String[] args) {
	
		String s="siva sai kri";
				String s1[]=s.split("\\s");
//				String s2="";
//				String rev="";
//				for(int i=0;i<s1.length;i++){
//				
//				String s3=s1[i];
//				
//				for(int j=0;j<s3.length();j++) {
//					rev=s3.charAt(j)+rev;
//				}
//				s1[i]=rev;
//				}
//				System.out.println(rev+" ");
//				System.out.println(s1[0]);
		String rev="";
		for(String s2:s1) {
			rev=s2+" "+rev;
		}
			System.out.println(rev);	
			


















}
}