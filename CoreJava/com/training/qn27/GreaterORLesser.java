package com.training.qn27;

import java.util.Scanner;

public class GreaterORLesser {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		findGreaterOrLesser(scan.nextInt(),scan.nextInt());
		scan.close();
	}

	private static void findGreaterOrLesser(int input1, int input2) {
		System.out.println(Math.max(input1,input2) + " is greater than "+Math.min(input1, input2));
	}

}
