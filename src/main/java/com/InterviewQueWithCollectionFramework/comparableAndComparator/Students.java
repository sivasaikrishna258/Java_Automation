package com.InterviewQueWithCollectionFramework.comparableAndComparator;

public class Students {

    String Name;
    int Age;

    @Override
    public String toString() {
        return
                "Name='" + Name + '\'' +
                ", Age=" + Age+ '\n'
                ;
    }

    public Students(String name, int age) {
        Name = name;
        Age=age;
    }
}
