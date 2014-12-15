package edu.lab.algorthms.lang_java;

public class Rectangle extends Figure {
	private double length, width;

	public Rectangle(double length, double breadth) {
		super(length, breadth);

	}

	public double getArea() {
		return length * width;
	}

}
