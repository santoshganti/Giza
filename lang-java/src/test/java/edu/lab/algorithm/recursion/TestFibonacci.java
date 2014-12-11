package edu.lab.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFibonacci {

	@Test
	public void test() {
		Fibonacci number = new Fibonacci();
		assertEquals(0, number.fibonacci(0));
		assertEquals(1, number.fibonacci(1));
		assertEquals(1, number.fibonacci(2));
		assertEquals(2, number.fibonacci(3));
		assertEquals(3, number.fibonacci(4));
		assertEquals(5, number.fibonacci(5));
		assertEquals(8, number.fibonacci(6));
		assertEquals(13, number.fibonacci(7));

	}

}
