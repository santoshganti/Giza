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

	@Test
	public void testImprove() {
		SquareRoot number = new SquareRoot();
		assertEquals(404.457, number.improve(600.000, 125348), 0.001);
		assertEquals(357.187, number.improve(404.457, 125348), 0.001);
		assertEquals(354.059, number.improve(357.187, 125348), 0.001);
		assertEquals(354.045, number.improve(354.059, 125348), 0.001);
	}
}
