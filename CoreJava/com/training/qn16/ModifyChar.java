package com.training.qn16;

public class ModifyChar {

	public static void main(String[] args) {
		modify("New York","New Jersey");
	}
/*
 * Given a method with two strings as input. Write code to modify the first string such that all characters are replace by plus sign(=) except the characters which are present in the second string. That is, if one or more characters of first string appear in second string, they will not be replace by +. Return the modified string as output. Note-ignore case.

Example: input1 = New York input2 = New Jersy output = New Y+r+
 */

	private static void modify(String input1, String input2) {
		System.out.println("input:"+input1);
		
		for (char input1Value:input1.toCharArray())
		{
			if(!input2.toLowerCase().contains(""+Character.toLowerCase(input1Value)))
				input1=input1.replace(input1Value, '+');
		}
		
		System.out.println("output:"+input1);

		
	}

}
