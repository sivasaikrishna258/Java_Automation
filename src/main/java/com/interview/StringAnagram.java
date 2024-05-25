package com.interview;
import java.util.Arrays;
public class StringAnagram {

	public static void main(String[] args) {

	String s1="akrifng1" ,s2="fnirkag1";
	
	char[] s = s2.toCharArray();
	char[] s3 = s1.toCharArray();

	if(s1.length()!=s2.length()) {
		System.out.println("not nanagram");
	}
	else {
	Arrays.sort(s);
	Arrays.sort(s3);
//	System.out.println(new String(s));
//	System.out.println(new String(s3));

	boolean b=Arrays.equals(s, s3);
	System.out.println(b);
	}
	}
}
