package com.training.qn02;


/*
 * Find the number of vowels in a given string
Input1:”NewyorkE” 'e' or 'E' - it should be counted as 1 
Output1:2 Hint:irrespective of case
 * 
 */
public class CountVowels {

	public static void main(String[] args) {
	 int count=0;
     String input="NewyorkE";
     
     input=input.toLowerCase();
     char[] vowels=new char[] {'a','e','i','o','u'};
     for (char ch:vowels)
     {
    	 if(input.indexOf(ch) >= 0)
    		 count++;
     }
     System.out.println("Number of vowels:"+count);
	}
}
