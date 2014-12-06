package edu.lab.algorithm.recursion;

public class SquareRoot {
	double a;
	double k = String.valueOf(a).length();// no. of the digits
	double n = k - 2; // we raise this as the power
	double j = k - n;// this gives the value of first two digits

	public void roughtApproximation(double a) {
		if (j < 10) {
			double S = (2 * Math.pow(10.0, n));
		} else {
			double S = (6 * Math.pow(10.0, n));
		}
	}

	public int squareRoot(int a) {
		if (n == 0) {
			roughtApproximation(a);
		}
		else{
			
		}
		
	}
}
