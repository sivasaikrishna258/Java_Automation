package com.InterviewQueWithCollectionFramework.exceptions;

public class CheckedAndUncheckedException {

    public static void main(String[] args) {

        method1();
    }

    //using throw keyword in unchecked exception

    public static void method1() {
        int age = 10;

        if (age < 18) {
            throw new ArithmeticException("Age is not eligible for the vote");

        } else {
            System.out.println("the value is");
        }
    }
}
