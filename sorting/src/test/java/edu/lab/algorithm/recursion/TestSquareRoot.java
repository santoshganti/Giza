package edu.lab.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquareRoot {

	@Test
	public void testIsGoodEnough() {
		SquareRoot number = new SquareRoot();
		assertFalse(number.isGoodEnough(600, 125348));
		assertFalse(number.isGoodEnough(404.457, 125348));
		assertFalse(number.isGoodEnough(354.059, 125348));
		assertTrue(number.isGoodEnough(354.045, 125348));

	}

	@Test
	public void testModulus() {
		SquareRoot number = new SquareRoot();
		assertEquals(1, number.modulus(-1), 0);
		assertEquals(1, number.modulus(1), 0);
		assertEquals(0, number.modulus(0), 0);
		
	}
}
