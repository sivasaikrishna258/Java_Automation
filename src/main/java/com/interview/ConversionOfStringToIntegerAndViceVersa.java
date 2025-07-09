package com.interview;

public class ConversionOfStringToIntegerAndViceVersa {
    /**
     * 🔁 1. Convert Number → String

✅ A. Using String.valueOf()
    int num = 123;
    String str = String.valueOf(num);

✅ B. Using Integer.toString() / Double.toString() etc.

    int num = 123;
    String str = Integer.toString(num);

    double pi = 3.14;
    String piStr = Double.toString(pi);
✅ C. Using String Concatenation

    int num = 123;
    String str = num + ""; // Not recommended for readability

🔁 2. Convert String → Number

✅ A. Using Integer.parseInt(), Double.parseDouble(), etc.

    String str = "456";
    int num = Integer.parseInt(str);

    String piStr = "3.14";
    double pi = Double.parseDouble(piStr);

✅ B. Using Integer.valueOf() (returns Integer object, not int)

    String str = "789";
    Integer num = Integer.valueOf(str); // Wrapper object


⚠️ Note on Exceptions
    If the string is not a valid number, you'll get a NumberFormatException:


    String str = "abc";
    int num = Integer.parseInt(str); // ❌ Throws NumberFormatException
    Use try-catch if you're unsure:

try {
        int num = Integer.parseInt(str);
    } catch (NumberFormatException e) {
        System.out.println("Invalid number!");
    }

//}
     */
}