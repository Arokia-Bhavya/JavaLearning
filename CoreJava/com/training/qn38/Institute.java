package com.training.qn38;

import java.util.Scanner;

public class Institute {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of trainees:");
		Trainee[] traineelist=new Trainee[scan.nextInt()];
		for(int index=0;index<traineelist.length;index++)
		{
			System.out.println("Enter Employee Name ");
			String empName=scan.next();
			System.out.println("Enter Employee Id ");
			String empId=scan.next();
			traineelist[index]=new Trainee(empName,empId);
		}
		scan.close();
		for(Trainee trainee:traineelist)
			trainee.display();
	}

}
