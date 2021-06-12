package com.training.qn12;

import java.util.Arrays;
import java.util.HashSet;

public class findUnionDiffIntersection {

	public static void main(String[] args) {
		printUnionDiffIntersection(new Integer[] {1,2,3,4},new Integer[] {3,4,5,6});

	}

	private static void printUnionDiffIntersection(Integer[] input1, Integer[] input2) {
		HashSet<Integer> outputUnion=new HashSet<Integer>();
		outputUnion.addAll(Arrays.asList(input1));
		outputUnion.addAll(Arrays.asList(input2));
		HashSet<Integer> outputIntersection=new HashSet<Integer>();
		outputIntersection.addAll(Arrays.asList(input1));
		outputIntersection.retainAll(Arrays.asList(input2));
		outputUnion.removeAll(outputIntersection);
		System.out.println(outputUnion);

	}

}
