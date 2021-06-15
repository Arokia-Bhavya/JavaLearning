package com.training.qn17;

public class ReplaceChar {

	public static void main(String[] args) {
		replace("curiosity");
		replace("zebra");
	}

	/*
	 * Replace the character at odd positions by next character in alphabet b. Leave the characters at even positions unchanged

Note:

if an odd position character is 'z' replace it by 'a'
assume the first character in the string is at position 1
	 */
	private static void replace(String input) {
		System.out.println("input:"+input);

		for(int index=0;index<input.length();index++)
		{
			if((index+1)%2 != 0)
			{
				char beginningAlphabet=(Character.isLowerCase(input.charAt(index))?'a':'A');
				int position=(input.charAt(index) - beginningAlphabet) +1;
				char value=(char)((position%26) + beginningAlphabet);
				input=input.replace(input.charAt(index),value);				
			}
				
		}
		
		System.out.println("output:"+input);
		
	}

}
