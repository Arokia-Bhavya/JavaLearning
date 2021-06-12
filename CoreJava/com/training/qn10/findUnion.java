package com.training.qn10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class findUnion {

	public static void main(String[] args) {

		printUnion(new Integer[] {1,2,3,4},new Integer[] {3,4,5,6});
	}

	private static void printUnion(Integer[] input1, Integer[] input2) {
		HashSet<Integer> outputSet=new HashSet<Integer>();
		List<Integer> output=new ArrayList<Integer>();
		outputSet.addAll(Arrays.asList(input1));
		outputSet.addAll(Arrays.asList(input2));
		System.out.println(outputSet);
	}

}
