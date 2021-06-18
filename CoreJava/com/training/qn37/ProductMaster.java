package com.training.qn37;

import java.util.Scanner;

import com.training.qn36.ProductDetails;

public class ProductMaster {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the product id ");
		Long productId=scan.nextLong();
		System.out.println("Enter the product name ");
		String productName=scan.next();
		System.out.println("Enter the suplier name ");
		String supplierName=scan.next();		
		scan.close();
		ProductDetails product=new ProductDetails(productId,productName,supplierName);
		product.display();
	}

}
