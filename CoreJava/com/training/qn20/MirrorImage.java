package com.training.qn20;

public class MirrorImage {

	public static void main(String[] args) {
		
		System.out.println("The output is "+getImage("EARTH"));

	}

	/*
	 * Accepts One String. Find the mirror image of the String. 
	 * Add the two Strings together separated by a pipe(|) symbol. 
	 * For Example Input : EARTH Output : EARTH|HTRAE
	 */
	private static String getImage(String input) {
		StringBuilder output=new StringBuilder();
		output.append(input);
		output.append('|');
		for(int index=input.length() - 1;index>=0;index--)
		{
			output.append(input.charAt(index));
		}
		
		return output.toString();
	}

}
