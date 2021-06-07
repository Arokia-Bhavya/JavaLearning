package com.training.qn13;

public class ConvertDecimal {

	public static void main(String[] args) {

		convertToBinary(12);
	}

	/*
	 * convert decimal to binary
	 */
	private static void convertToBinary(int num) {
	
		int[] output=new int[40];
		int index=0;
		while(num>0)
		{
			output[index++]=num%2;
			num=num/2;
		}
		
		for(int count=index - 1;count>=0;count--)
		{
			System.out.print(output[count]);
		}
	}

}
