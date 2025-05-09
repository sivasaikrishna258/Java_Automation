package com.interview;

public class StaticKeywordExample1 {

    String name;
    int age;
    static String companyName="mnc";  //here we are assigning static variable

    public StaticKeywordExample1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public StaticKeywordExample1() {
        System.out.println("nothing in the constructor");
    }

    @Override
    public String toString() {
        return "StaticKeywordExample1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company=" + companyName +
                '}';
    }


    public void display(){
        System.out.println("hi");
    }

    public static void show(){
        System.out.println("static method");
    }


    static {
        System.out.println("static block executing");
    }
}
