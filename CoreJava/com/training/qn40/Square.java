package com.training.qn40;

public class Square extends Shape{
Integer side;

public Square(Integer side) {
	super("Square");
	this.side = side;
}

Double calculateArea()
{
	return side*side*1.0;
}

public Integer getSide() {
	return side;
}

public void setSide(Integer side) {
	this.side = side;
}
}
