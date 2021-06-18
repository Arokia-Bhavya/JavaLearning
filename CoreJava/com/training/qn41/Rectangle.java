package com.training.qn41;

public class Rectangle extends Shape{
	Integer length;
	Integer breadth;
	
	public Rectangle(Integer length,Integer breadth) {
		super("rectangle");
		this.length=length;
		this.breadth=breadth;
	}

	public Double calculateArea()
	{
		return this.length * this.breadth * 1.0;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getBreadth() {
		return breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}
}
