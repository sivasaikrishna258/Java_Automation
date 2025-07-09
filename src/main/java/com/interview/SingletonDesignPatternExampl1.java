package com.interview;

public class SingletonDesignPatternExampl1 {

	static SingletonDesignPatternExampl1 reference =null;
	int c=10;
	
	private SingletonDesignPatternExampl1() {
		
	}
	
	static SingletonDesignPatternExampl1 getreference() {
		reference=new SingletonDesignPatternExampl1();
		
		return reference;
	}
}
