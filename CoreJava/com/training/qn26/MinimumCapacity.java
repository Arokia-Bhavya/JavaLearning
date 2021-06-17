package com.training.qn26;

public class MinimumCapacity {

	public static void main(String[] args) {
		System.out.println("The Minimum Capacity Available is"+findMinimumCapacity(10,20,30));
	}

	private static int findMinimumCapacity(int lab1, int lab2, int lab3) {

		return Math.min(lab1, Math.min(lab2, lab3));
	}

}
