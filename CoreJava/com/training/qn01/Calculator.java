package com.training.qn01;

public class Calculator {

	/*
	 * Create a calculator class to perform addition, subtraction, multiplication and division of two integers. 
	 * Get inputs from command line/program arguments.
	 */
	public static void main(String[] args) {
		
		System.out.println("Addition:"+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		System.out.println("Subtraction:"+(Integer.parseInt(args[0])-Integer.parseInt(args[1])));
		System.out.println("Multiplication:"+(Integer.parseInt(args[0])*Integer.parseInt(args[1])));
		System.out.println("Division:"+(Integer.parseInt(args[0])/Integer.parseInt(args[1])));
	}

}
