package com.training.qn32;

import java.util.Scanner;

public class RedCross {

	public static void main(String[] args) {
		System.out.println("Enter the number of tents:");
		Scanner scan=new Scanner(System.in);
		int noOftents=scan.nextInt();
		int[] refugees=new int[noOftents];
		int sum=0;
		for(int index=0;index<noOftents;index++)
		{
			System.out.println("Enter the number of refugees in "+(index+1)+":");
			refugees[index]=scan.nextInt();
			sum+=refugees[index];
		}
		scan.close();
		System.out.println("Total No of refugees are "+sum);
	}

}
