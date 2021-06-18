package com.training.qn36;

import java.util.Scanner;

public class ProductMaster {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ProductDetails product=new ProductDetails();
		System.out.println("Enter the product id ");
		product.setId(scan.nextLong());
		System.out.println("Enter the product name ");
		product.setProductName(scan.next());
		System.out.println("Enter the suplier name ");
		product.setSupplierName(scan.next());		
		scan.close();
		product.display();
	}

}
