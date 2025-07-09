package com.interview;

/**
 * static keyword is mainly used for memory management in java.it can be used with the classes , methods, variables
 * static keyword is belongs to class rather than the instance of class that means if we try to modify the class property with static keyword it will be applicable to the all tje instances.
 * in the below example we are just updating the companyName only once ,so it is updating for both the instances because static variables are belongs to class rather that the instance of class
 */
public class StaticKeywordExample {
    public static void main(String[] args) {

        //one example for static variables
        StaticKeywordExample1 s=new StaticKeywordExample1("siva",20);
        StaticKeywordExample1 s1=new StaticKeywordExample1("sai",25);

        System.out.println(s.toString());
        System.out.println(s1); //output :

        StaticKeywordExample1.companyName="startup";
        System.out.println(s.toString());
        System.out.println(s1);



        //example for static block (here i am just calling another non static method so that the static block is executing automatically)
        StaticKeywordExample1 staticKeywordExample1=new StaticKeywordExample1(); //when i created object the static block is executed

        //same example for static method
        StaticKeywordExample1.show();//when i call static method the static block get's executed

    }
}
