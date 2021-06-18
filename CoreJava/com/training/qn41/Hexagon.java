package com.training.qn41;

import com.training.qn41.Shape;

public class Hexagon extends Shape{
Integer side;

public Integer getSide() {
	return side;
}

public void setSide(Integer side) {
	this.side = side;
}

public Hexagon(Integer side) {
	super("hexagon");
	this.side = side;
}
}
