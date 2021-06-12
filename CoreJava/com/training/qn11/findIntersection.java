package com.training.qn11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findIntersection {

	public static void main(String[] args) {
		printIntersection(new Integer[] {1,2,3,4},new Integer[] {3,4,5,6});
	}

	private static void printIntersection(Integer[] input1, Integer[] input2) {
		List<Integer> output=new ArrayList<Integer>();
		output.addAll(Arrays.asList(input1));
		output.retainAll(Arrays.asList(input2));
		System.out.println(output.toString());
	}

}
