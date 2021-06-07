package com.training.qn06;

public class ConvertToString {

	public static void main(String[] args) {
		
		convert(new String[] {"Vikas","Lokesh","Ashok"});
		
	}
	
	/*
	 * Convert String array to String
	 */
	private static void convert(String[] inputArray) {
		StringBuilder output=new StringBuilder();
		for(String input:inputArray)
			output.append(input+",");
		output.setLength(output.length() - 1);
		System.out.println(output.toString());
	
	}

}
