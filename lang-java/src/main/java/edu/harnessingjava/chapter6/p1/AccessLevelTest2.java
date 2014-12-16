package edu.harnessingjava.chapter6.p1;

import edu.lab.algorthms.lang_java.AccessLevelSample;

public class AccessLevelTest2 {
	public static void main(String args[]) {
		AccessLevelSample a1 = new AccessLevelSample();

		// int a = a1.v1;
		// int b = a1.v2;
		// int c = a1.v3;
		int d = a1.v4;

		System.out.println("d= " + d);

		a1.m4(); // other three methods cannot be accessed

		// modify the access of instance variables
		a1.v4 = 40;

		System.out.println("\nAfter modifying v4..");
		a1.m4();
	}
}
