package edu.lab.algorthms.lang_java;

public class Calculator implements CalculateNumbers {
	public double add(double a, double b) {

		return (a + b);

	}

	public double substract(double a, double b) {
		return (a - b);

	}

	public double multiply(double a, double b) {
		return (a * b);

	}

	public double divide(double a, double b) {
		if (b == 0)
			throw new IllegalArgumentException();
		else
			return (a / b);

	}

	public double modulus(double a) {
		if (a > 0)
			return a;
		else
			return -a;
	}

	public double factorial(double n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public double speed(double time, double distance) {
		return multiply(time, distance);
	}

	public double time(double speed, double distance) {
		return divide(speed, distance);
	}

	public double distance(double speed, double time) {
		return divide(speed, time);
	}

}
