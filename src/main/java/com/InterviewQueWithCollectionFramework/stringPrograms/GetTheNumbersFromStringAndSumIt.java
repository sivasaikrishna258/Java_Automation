package com.InterviewQueWithCollectionFramework.stringPrograms;

public class GetTheNumbersFromStringAndSumIt {
    public static void main(String[] args) {


            String[] str = {"7qwe5", "r4e9y", "uhgdd90"};
            String [] str1=new String[3];
            int i=0;
            int sum=0;
            String s;
            for(String word:str){
                String s1="";
                for(char c:word.toCharArray()){
                    if(Character.isDigit(c)){
                        s=String.valueOf(c);
                        s1=s1+s;
                    }


                }
                str1[i]=s1;
                i++;
            }

            for(String numbers:str1){
                sum=sum+Integer.parseInt(numbers);
            }
            System.out.println(sum);

        }
    }

