package com.InterviewQueWithCollectionFramework.exceptions;


/**
What’s Happening Here?
methodC() causes an exception (10 / 0).

It doesn’t handle it, so it goes to methodB().

methodB() also doesn’t handle it, so it goes to methodA().

methodA() doesn’t handle it either, so it finally goes to main().

main() handles it using try-catch.

✔️ This is exception propagation in action.
 */

/**
 Only unchecked exceptions (like ArithmeticException, NullPointerException) propagate automatically.

 For checked exceptions (like IOException), you must either:

 Handle them with try-catch, or

 Declare them with throws.
 */
public class ExceptionPropogation {

    public static void main(String[] args) {

        ExceptionPropogation t = new ExceptionPropogation();
        try {
            t.methodA();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e);
        }
    }
            void methodA() {
                methodB();
            }

            void methodB() {
                methodC();
            }

            void methodC() {
                int result = 10 / 0;  // This will cause ArithmeticException
            }


        }
