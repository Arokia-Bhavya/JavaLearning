package com.training.qn21;

public class SumOfPower {

	public static void main(String[] args) {
		System.out.println("Output is:"+calculatePower(new int[] {3,6,2,1}));
	}
	/*
	 * Given a method with a string input. 
	 * Write code to test if first and last characters are same. 
	 * Incase they are same return 1 else return -1 as output.
	 * Note: consider case. Example: input = "the picture was great" 
	 * (first character = 't', last character = 't') output = 1
	 */

	private static int calculatePower(int[] input) {
		int sumOfPower=0;
		for(int index=0;index<input.length;index++)
		{
			sumOfPower+=(int) Math.pow(input[index], index);
		}

		
		return sumOfPower;
	}

}
