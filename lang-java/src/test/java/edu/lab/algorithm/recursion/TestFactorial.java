package edu.lab.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void factorialTest() {
		Factorial number = new Factorial();
		assertEquals(120, number.factorial(5));
		assertEquals(3628800, number.factorial(10));
	}

}
