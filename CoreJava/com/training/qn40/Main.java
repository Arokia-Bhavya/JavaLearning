package com.training.qn40;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.Rectangle 2.Square 3.Circle Area Calculator --- Choose your shape");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter length and breadth:");
			Shape rectangle=new Rectangle(scan.nextInt(),scan.nextInt());
			System.out.println("Area of "+rectangle.getShapeName()+" is: "+rectangle.calculateArea());
			
		}else if(choice == 2)
		{
			System.out.println("Enter side:");
			Shape square=new Square(scan.nextInt());
			System.out.println("Area of "+square.getShapeName()+" is: "+square.calculateArea());
		}else if(choice == 3)
		{
			System.out.println("Enter radius:");
			Shape circle=new Circle(scan.nextInt());
			System.out.println("Area of "+circle.getShapeName()+" is: "+circle.calculateArea());
		}
		scan.close();
	}

}
