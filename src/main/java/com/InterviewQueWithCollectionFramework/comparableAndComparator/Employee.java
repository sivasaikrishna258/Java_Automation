package com.InterviewQueWithCollectionFramework.comparableAndComparator;

public class Employee implements Comparable<Employee> {

    int no;
    String Name;

    public Employee(String name, int s) {
        this.Name = name;
        this.no=s;
    }

    @Override
    public String toString() {
        return Name +" "+no;
    }

    @Override
    public int compareTo(Employee o) {
        return this.no - o.no;
    }
}
