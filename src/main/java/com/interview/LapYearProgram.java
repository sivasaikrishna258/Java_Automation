package com.interview;

//if year is century year and if it is divisble by 400 then it is leap year
//if year is not century year and if it is divisible by 4  then it is leap year
public class LapYearProgram {

	public static void main(String[] args) {

		int year=1700;
		
		if(year%100==0) {
			if(year%400==0) {
			System.out.println("century and leapyear");
			}else {
				System.out.println("century and not leap");
			}
		}else {
			if(year%4==0) {
			System.out.println("non century and leap");
			}else {
				System.out.println("non century and not leap");
			}
		}
	}

}
