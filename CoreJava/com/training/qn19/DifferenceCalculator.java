package com.training.qn19;

public class DifferenceCalculator {

	public static void main(String[] args) {
		System.out.println("The output is "+calculateDifference(10));
	}

	/*
	 * Logic - Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. For Example if n is 10,
	 * you have to find (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2
	 */
	private static int calculateDifference(int num) {
		int sum=0;
		int sumOfSquares=0;
		for(int index=1;index<=num;index++)
		{
			sum+=index;
			sumOfSquares+=(index*index);
		}
		
		return sumOfSquares - (sum*sum);
	}

}
