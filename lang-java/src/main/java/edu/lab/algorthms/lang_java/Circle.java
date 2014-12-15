package edu.lab.algorthms.lang_java;

public class Circle extends Figure{

	public Circle(double length, double breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	private double radius;

	public double getArea()
	{
		return (3.14 * (radius * 2)); 	
	}

}
