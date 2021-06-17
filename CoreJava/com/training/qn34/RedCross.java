package com.training.qn34;

import java.util.Arrays;
import java.util.Scanner;

public class RedCross {

	public static void main(String[] args) {
		System.out.println("Enter the number of tents:");
		Scanner scan=new Scanner(System.in);
		int noOftents=scan.nextInt();
		int[] refugees=new int[noOftents];
		int index=0;
		for(int value:refugees)
		{
			System.out.println("Enter the number of refugees in "+(index+1)+":");
			refugees[index++]=scan.nextInt();
		}
		scan.close();
		System.out.println("No of refugees are "+Arrays.toString(refugees));
	}

}
