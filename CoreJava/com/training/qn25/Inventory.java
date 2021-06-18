package com.training.qn25;

import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Price of item 1 :");
		float total=scan.nextFloat();
		System.out.println("Price of item 2 :");
		total+=scan.nextFloat();
		System.out.println("Discount in percentage :");
		int discount=scan.nextInt();
		scan.close();
		System.out.println("Total amount:"+total);
		double discountPrice=(total*discount)/100.00;
		double scale=Math.pow(10, 2);
		System.out.println("Discounted amount :"+Math.round((total - discountPrice)*scale)/scale);
		System.out.println("Saved amount :"+discountPrice);
	}

}
