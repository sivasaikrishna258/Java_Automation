package com.interview;

public class Private2 {

	static Private2  reference =null;
	int c=10;
	
	private Private2() {
		
	}
	
	static Private2 getreference() {
		reference=new Private2();
		
		return reference;
	}
}
