package com.interview;

public class MultiThreadingConcept {

    /**
     * What is Thread in Java?
     * A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.
     *
     * Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.
     *
     */

    //thread safe means  multiple threads are running independently with seperate instances or one thread will wait for the another thread to be complete
    /**
     * 🧠 Why use ThreadLocal?
     * In parallel execution, if multiple threads share the same object (like a single WebDriver instance), they’ll conflict, causing flaky or failed tests. ThreadLocal solves this.
     *
     * 2. During parallel execution:
     * TestNG or JUnit starts multiple threads for tests.
     *
     * Each thread calls setDriver(), creating its own WebDriver instance.
     *
     * Throughout the test, the thread uses getDriver() to access its own driver.
     *
     * Each thread accesses its own isolated instance, stored in the ThreadLocal container.
     */

    /**
     * ✅ Short Answer:
     * ThreadLocal<WebDriver> is a kind of Singleton — but at the thread level.
     * So yes, if you're using ThreadLocal to manage your WebDriver, you don’t need a traditional Singleton pattern on top of it.
     */
}
