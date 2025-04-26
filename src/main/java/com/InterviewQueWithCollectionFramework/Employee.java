package com.InterviewQueWithCollectionFramework;

public class Employee {

    int no;
    String Name;

    public Employee(String name, int s) {
        Name = name;
        no=s;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", Name='" + Name + '\'' +
                '}';
    }
}
