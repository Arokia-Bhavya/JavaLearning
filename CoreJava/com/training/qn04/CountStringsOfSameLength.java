package com.training.qn04;

public class CountStringsOfSameLength {
	public static void main(String[] args)
	{
		getCount(new String[] {"aa","b","cc","ddd"},2);
		
		getCount(new String[] {"aa","b","cc","ddd"},3);
	}

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
