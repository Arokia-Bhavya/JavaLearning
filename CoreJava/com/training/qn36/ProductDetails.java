package com.training.qn36;

public class ProductDetails {
private Long id;
private String productName;
private String supplierName;


public ProductDetails()
{
	
}

public ProductDetails(Long id, String productName, String supplierName) {
	super();
	this.id = id;
	this.productName = productName;
	this.supplierName = supplierName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public void display()
{
	System.out.println("Product Id is "+this.getId()+" Product Name is "+this.getProductName()+" Supplier Name is "+this.getSupplierName());
}
}
