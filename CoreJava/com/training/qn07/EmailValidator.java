package com.training.qn07;

public class EmailValidator {

	public static void main(String[] args) {
		
		validateEmailId("test@gmail.com");
		validateEmailId("test@.gmail.com");
		
	}

	/*
	 * 1)@ & : should be present;
	 * 2)@ & . should not be repeated; 
	 * 3)there should be four charcters between @ and .;
	 * 4)there should be atleast 3 characters before @ ;
	   5)the end of mail id should be .com; Expected Output=true
	 */
	private static void validateEmailId(String input) {
				
		if(input.indexOf('@')>=3 && input.indexOf('.')>-1 
		 && (input.indexOf('.') - input.indexOf('@'))>=4
		 && input.endsWith(".com"))
		{
			System.out.println("The given EmailId "+input+" is of correct format");
		}else
		{
			System.out.println("The given EmailId "+input+" is of incorrect format");
		}
	}

}
