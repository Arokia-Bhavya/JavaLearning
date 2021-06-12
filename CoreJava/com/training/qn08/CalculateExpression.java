package com.training.qn08;


public class CalculateExpression {

	
	public static void main(String[] args)
	{
		getResult(5,6,8,3);
	}

	private static void  getResult(double x1, double x2, double y1, double y2) {
		
		int result=(int) Math.sqrt((( x1 + x2)*(x1+x2)) + ((y1 + y2)*(y1+y2))) ;
		System.out.println(result);
	}
}
