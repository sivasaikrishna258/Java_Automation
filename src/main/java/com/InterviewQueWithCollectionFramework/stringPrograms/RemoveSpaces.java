package com.InterviewQueWithCollectionFramework.stringPrograms;

public class RemoveSpaces {
        public static void main(String[] args) {

            String s ="siva sai krishna";

            StringBuilder s1=new StringBuilder();


            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=' '){
                    s1.append(s.charAt(i));
                }
            }
            System.out.println(s1); //print string without spaces
        }
    }


