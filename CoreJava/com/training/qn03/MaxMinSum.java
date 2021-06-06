package com.training.qn03;

public class MaxMinSum {
	
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
