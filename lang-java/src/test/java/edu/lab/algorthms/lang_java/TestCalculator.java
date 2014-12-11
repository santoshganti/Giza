package edu.lab.algorthms.lang_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	Calculator calculate = new Calculator();

	@Test
	public void testAddition() {

		assertEquals(5, calculate.add(3, 2), 0.01);
	}

	@Test
	public void testSubstraction() {
		assertEquals(1, calculate.substract(3, 2), 0.01);
	}

	@Test
	public void testMultiplication() {
		assertEquals(6, calculate.multiply(3, 2), 0.01);
	}

	@Test
	public void testDivision() {
		assertEquals(1.5, calculate.divide(3, 2), 0.01);
	}

	@Test
	public void testModulus() {
		assertEquals(1, calculate.modulus(-1), 0.01);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZeroException() {
		calculate.divide(1, 0);
	}
}
