package com.interview;


/**
 * ✅ Singleton Design Pattern  -- > it is mainly used for the static properties that are used by all the tests
 * Definition:
 * Ensures that only one instance of a class exists across the entire application (JVM).
 *
 * Use Case:
 * When you want a shared object, such as:
 *
 * ConfigReader (to load configuration once)
 *
 * Logger
 *
 * Database connection pool
 *
 * Key Trait:
 * Same object is shared by all threads and classes.
 *
 * ✅ ThreadLocal  -- > it is used to
 * Definition:
 * Creates a separate instance of a variable for each thread.
 * Even though multiple threads access the same ThreadLocal, they each get their own isolated copy.
 *
 * Use Case:
 * When you want to avoid shared state between threads, such as:
 *
 * WebDriver in parallel Selenium tests
 *
 * Thread-specific data like session or user info
 *
 * Key Trait:
 * Each thread gets its own unique object — ideal for parallel execution.
 */
public class SingletonDesignPatternExample {

	public static void main(String[] args) {

		SingletonDesignPatternExampl1 a = SingletonDesignPatternExampl1.getreference();
		
		System.out.println(a.c);
	}

}
