package com.InterviewQueWithCollectionFramework.collectionFramework;

public class Employee {

    int no;
    String Name;

    public Employee(String name, int s) {
        Name = name;
        no=s;
    }

    public void display(){
        System.out.println(Name +" "+no);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", Name='" + Name + '\'' +
                '}';
    }
}
