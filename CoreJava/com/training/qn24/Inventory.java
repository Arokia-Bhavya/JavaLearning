package com.training.qn24;

import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of dozens purchased:");
		int noOfDozens=scan.nextInt();
		System.out.println("Enter the cost per dozen:");
		int costPerDozen=scan.nextInt();
		System.out.println("Enter the selling price per item:");
		int sellingPrice=scan.nextInt();
		scan.close();
		double costPrice=costPerDozen/12.0;
		double profit=((sellingPrice - costPrice)/costPrice)*100.00;
		double scale=Math.pow(10, 2);
		System.out.println("Profit Percentage:"+(Math.round(profit*scale)/scale) +"%");
	}

}
