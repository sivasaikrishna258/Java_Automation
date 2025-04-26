package com.InterviewQueWithCollectionFramework.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Use when you want to define natural sorting (like alphabetical, numeric) within the class itself.
  ✅ When Collections.sort() does work without extra code
 * If you're sorting a list of built-in types like:
 Integer, String, Character
 *Why? Because String already implements Comparable<String>, so Java knows how to compare them.

 ❌ When Collections.sort() does NOT work on its own
 If you try to sort your own custom object without implementing Comparable or providing a Comparator, Java will throw a runtime exception:

 * If the result is negative (< 0):
 * 👉 this comes before other
 *
 * If the result is zero (== 0):
 * 👉 this and other are equal
 *
 * If the result is positive (> 0):
 * 👉 this comes after other
 */
public class ComparableDemo {
    public static void main(String[] args) {


        Employee emp = new Employee("siva", 26);
        Employee emp1=new Employee("sai",24);

        List<Employee> ls = new ArrayList<>();
        ls.add(emp);
        ls.add(emp1);
        Collections.sort(ls);
        System.out.println(ls);

    }
}
