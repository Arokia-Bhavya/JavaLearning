package com.training.qn41;

public class Shape {
	protected String shapeName;
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}
	Double calculateArea()
	{
		return 0.0;
	}
}
