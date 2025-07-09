package com.InterviewQueWithCollectionFramework.exceptions;
/**
 * ✅ Exception
 * An Exception in Java is an event that disrupts the normal flow of the program and is caused by issues that can be anticipated and handled during runtime, such as invalid user input, file not found, or division by zero.
 *
 * It is a recoverable condition.

 * 📝 Example: NullPointerException, IOException, ArithmeticException
 *
 * ❌ Error
 * An Error in Java is a serious problem that occurs outside the control of the application and usually represents critical system-level issues like memory overflow or stack overflow.
 *
 * It is non-recoverable and should not be handled in code.
 *
 * 📝 Example: OutOfMemoryError, StackOverflowError, VirtualMachineError
 */

/**
 * | Feature                        | **Checked Exception**                                           | **Unchecked Exception**                                                         |
 * | ------------------------------ | --------------------------------------------------------------- | ------------------------------------------------------------------------------- |
 * | **Definition**                 | Exceptions **checked at compile time**                          | Exceptions **not checked at compile time**                                      |
 * | **Belongs to**                 | Subclasses of `Exception` (excluding `RuntimeException`)        | Subclasses of `RuntimeException`                                                |
 * | **Compiler Requirement**       | **Must** be either handled (`try-catch`) or declared (`throws`) | **Not required** to be handled or declared                                      |
 * | **Examples**                   | `IOException`, `SQLException`, `FileNotFoundException`          | `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException` |
 * | **Handling using try-catch**   | ✅ Yes                                                           | ✅ Yes (optional)                                                                |
 * | **Declaration using throws**   | ✅ Yes (compiler enforces it)                                    | ✅ Allowed, but not enforced by compiler                                         |
 * | **Common Causes**              | External resources (file, DB, network issues)                   | Programming mistakes (bad logic, null, divide by zero)                          |
 * | **Caught at**                  | Compile time                                                    | Runtime                                                                         |
 * | **If not handled or declared** | ❌ Compile-time error                                            | ⚠️ Runtime crash (no compile error)                                             |
 * | **Use Case**                   | Anticipated & recoverable problems                              | Unexpected bugs & programming errors                                            |
 */
public class  CheckedAndUncheckedException {

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
