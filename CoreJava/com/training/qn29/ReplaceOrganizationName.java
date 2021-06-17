package com.training.qn29;

import java.util.Scanner;

public class ReplaceOrganizationName {

	public static void main(String[] args) {
		System.out.println("Enter the content of document:");
		Scanner scan=new Scanner(System.in);
		String content=scan.nextLine();
		System.out.println("Enter the old company name:");
		String oldCompanyName=scan.nextLine();
		System.out.println("Enter the new company name:");
		String newCompanyName=scan.nextLine();
		scan.close();
		System.out.println("The Modified content :"+content.replace(oldCompanyName,newCompanyName));
	}

}
