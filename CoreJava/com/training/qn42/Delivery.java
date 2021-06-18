package com.training.qn42;

public class Delivery {
	void displayDeliveryDetails(String bowler, String batsman)
	{		
		System.out.println("Bowler "+bowler+
				" Batsman "+batsman);
	}
	
	void displayDeliveryDetails(Long runs)
	{
		System.out.println("Number of runs scored in the delivery "+runs);
		if(runs==4)
			System.out.println("It is a boundary.");
		else if(runs==6)
			System.out.println("It is a sixer.");
		
	}
	
}
