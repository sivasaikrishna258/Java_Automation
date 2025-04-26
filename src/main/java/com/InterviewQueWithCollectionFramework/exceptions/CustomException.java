package com.InterviewQueWithCollectionFramework.exceptions;


public class CustomException {
    public static void main(String[] args) throws AgeIsNotValidExcepion {
        int age=110;
         if(age>20){
             throw new AgeIsNotValidExcepion("afi is less");
         }
    }
}
