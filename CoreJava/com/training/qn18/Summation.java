package com.training.qn18;

public class Summation {

	public static void main(String[] args) {
		System.out.println("The output is:"+calculateSum(10));
	}

	/*
	 * Logic - Calculate the sum of first n natural numbers which are divisible by 3 or 5.

	 */
	private static int calculateSum(int n) {
		int sum=0;
		for(int index=1;index<=n;index++)
		{
			if((index%3) == 0 || (index%5) == 0)
				sum+=index;
		}
			
		return sum;
	}

}
