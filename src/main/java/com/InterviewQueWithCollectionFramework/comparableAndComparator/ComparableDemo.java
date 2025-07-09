package com.InterviewQueWithCollectionFramework.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Use Collection.sort() when you want to define natural sorting (like alphabetical, numeric) within the class itself.
  ✅ When Collections.sort() does work without extra cod If you're sorting a list of built-in types like:Integer, String, Character
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

/** difference between comparable and comparator
 *
* Comparable is an interface that is used to define the natural ordering of objects of a class.
* It is implemented by the class whose objects need to be compared.
* It defines a single method compareTo(T o) that compares the current object with the specified object.

* Comparator is an interface that is used to define a custom ordering of objects of a class.
* It is implemented by a separate class that defines the comparison logic.
 *  It defines two methods: compare(T o1, T o2) that compares two objects and equals(Object obj) that checks if two objects are equal.
 *  The main difference between Comparable and Comparator is that Comparable is used to define the natural ordering of objects, while Comparator is used to define a custom ordering of objects.

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
