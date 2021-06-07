package com.training.qn15;

public class RemoveDuplicates {
 public static void main(String[] args)
 {
	 removeCharDuplicates(new String("helloworld"));
 }

 /*
  * Display unique characters in a string
  */
private static void removeCharDuplicates(String input) {
	
	StringBuilder output=new StringBuilder();
	for(char value:input.toCharArray())
	{
	   if(output.indexOf(""+value)==-1)
		   output.append(value);
	}
	
	System.out.println(output.toString());
}
}
