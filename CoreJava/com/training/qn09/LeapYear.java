package com.training.qn09;

public class LeapYear {

	public static void main(String[] args) {
		isLeapYear(2020);
	}

	private static void isLeapYear(int year) {
		if((year%4) ==0 || (year%100)==0 && (year%400)==0)
			System.out.println(year+" is LeapYear");
		
	}

}
