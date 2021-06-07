package com.training.qn05;

public class findSum {

	public static void main(String[] args) {
		getSumFromInput(new String[] {"2AA","12","ABC","c1a"});

	}

	/*
	 * Find the sum of the numbers in the given input string array
	 */
	private static void getSumFromInput(String[] inputs) {
		int sum=0;
		for(String input:inputs)
			for(char value:input.toCharArray())
			{
				if(Character.isDigit(value))
				{
					sum+=Character.getNumericValue(value);
				}
			}
		System.out.println("sum:"+sum);
	}

}
