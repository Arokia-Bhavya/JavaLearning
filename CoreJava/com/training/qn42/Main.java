package com.training.qn42;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Menu 1.Player details of the delivery 2.Run details of the delivery");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the bowler name");
			scan.next();
			String bowler=scan.next();
			System.out.println("Enter the batsman name");
			scan.next();
			new Delivery().displayDeliveryDetails(bowler, scan.next());
		}else if(choice==2)
		{
			System.out.println("Enter the number of runs");
			new Delivery().displayDeliveryDetails(scan.nextLong());
		}
		scan.close();
	}

}
