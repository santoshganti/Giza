package edu.ocaguide.objective.inheritance;


public class Rectangle extends Figure {
	private double length, width;

	public Rectangle(double length, double breadth) {
		super(length, breadth);

	}

	public double getArea() {
		return length * width;
	}

}
