package com.training.qn30;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("Enter the Day Number:");
		Scanner scan=new Scanner(System.in);
		int index=Integer.parseInt(scan.next());
		System.out.println("The day of week is "+days[index - 1]);
		scan.close();
	}

}
