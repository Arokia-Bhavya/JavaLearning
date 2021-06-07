package com.training.qn14;

public class paddingDollar {

	public static void main(String[] args) {

		paddingDollarSign(new String[] {"abc","da","ram"},3);
	}

	/*
	 * Concatenate the character in a given position. 
	 * If there is no character in a given position place "$" sign
	 */
	private static void paddingDollarSign(String[] inputArray,int position) {
		StringBuilder output=new StringBuilder();
		for(String input:inputArray)
		{
			if(position <= input.length())
				output.append(input.charAt(position - 1));
			else
				output.append("$");
		}
		
		System.out.println(output.toString());
	}

}
