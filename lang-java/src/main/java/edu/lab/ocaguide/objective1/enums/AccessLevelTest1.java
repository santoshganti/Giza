package edu.lab.ocaguide.objective1.enums;

public class AccessLevelTest1 {
	public static void main(String args[]) {
		AccessLevelSample a1 = new AccessLevelSample();
		// int a=a1.v1;
		int b = a1.v2;
		int c = a1.v3;
		int d = a1.v4;
		System.out.println("b=" + b + " c= " + c + " D=" + d);

		// a1.m1(); Compiler error cannot compile
		a1.m2();
		a1.m3();
		a1.m4();

		// Modify the values of the instance variables
		a1.v2 = 20;
		a1.v3 = 30;
		a1.v4 = 40;

		System.out.println("\nAfter Modifying v2,v3 and v4 ");
		a1.m2();
		a1.m3();
		a1.m4();
	}
}
