package com.training.qn03;

public class MaxMinSum {
	/*
	 * Find the sum of maximum and minimum number from a given input array 
	 * Input:{19,17,12} max - 19 min - 12 sum - 31 Output:31
	 */
	
	public static void main(String[] args)
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int[] input=new int[] {19,17,12};
		for (int num:input)
		{
			if(num>max)
				max=num;
			else if(num < min)
				min=num;
				
		}
		
		System.out.println("sum ="+(min + max));
	}

}
