package edu.harnessingjava.chapter6;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportTest {
	public static void main(String args[]) {
		double radius = 2.9;
		double area = PI * radius * radius;
		out.println("The value of pi is: " + PI);
		out.println("The value of radius is: " + radius);
		out.println("The area of the circle is: " + area);
	}
}
