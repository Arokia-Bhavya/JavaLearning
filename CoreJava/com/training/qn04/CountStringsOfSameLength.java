package com.training.qn04;

public class CountStringsOfSameLength {
	public static void main(String[] args)
	{
		getCount(new String[] {"aa","b","cc","ddd"},2);
		
		getCount(new String[] {"aa","b","cc","ddd"},3);
	}

	/*
	 * Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”} Input2:2 Output1:2

		Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1

		Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1
	 */
	private static void  getCount(String[] input1,int input2) {
		
		int count=0;
		for(String value:input1)
		{
			if(value.length() == input2)
				count++;
		}
		System.out.println("count of Strings of given length:"+count);
	}

}
