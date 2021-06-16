package com.training.qn23;

public class Store {

	public static void main(String[] args) {

		System.out.println("The output is :"+caculateProfit(30.5,20.54)+"%");
	}

	private static  int caculateProfit(double sellingPrice, double buyingPrice) {

		return (int)(((sellingPrice - buyingPrice)*100)/buyingPrice);
	}

}
