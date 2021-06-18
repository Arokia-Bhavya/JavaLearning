package com.training.qn40;

public class Circle extends Shape{
	Integer radius;

	public Circle(Integer radius) {
		super("circle");
		this.radius=radius;
	}
	
	public Double calculateArea()
	{
		double scale=Math.pow(10, 2);
		return Math.round(Math.PI * radius * radius * scale)/scale ;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

}
