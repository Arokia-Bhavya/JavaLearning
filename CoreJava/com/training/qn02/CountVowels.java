package com.training.qn02;

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
