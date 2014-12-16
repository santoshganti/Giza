package edu.lab.algorthms.lang_java;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.harnessingjava.chapter2.EdgeCases;

public class TestEdgeCases {

//	@Test(expected=ArithmeticException.class)
//	public void test() {
//		OverloadingMethods number = new OverloadingMethods();
//		assertEquals(0,number.divide(1,0),0.01);
//		assertEquals(0,number.divide(1.0, 0),0.01);
//		assertEquals(0,number.divide(1f, 0),0.01);
//		
//		
	@Test(expected=ArithmeticException.class)
	public void testIntDivideByZero() {
		EdgeCases number = new EdgeCases();
		assertEquals(0, number.divide(1, 0), 0.01);
	}

	@Test
	public void testFloatDivideByZero() {
		EdgeCases number = new EdgeCases();
		assertEquals(Float.POSITIVE_INFINITY, number.divide(1f, 0), 0.01);
	}

	@Test
	public void testDoubleDivideByZero() {
		EdgeCases number = new EdgeCases();
		assertEquals(Double.NEGATIVE_INFINITY, number.divide(1f, -0f), 0.01);
	}

	@Test
	public void testDoubleDivideByZero1() {
		EdgeCases number = new EdgeCases();
		assertEquals(Double.NaN, number.divide(0f, 0), 0.01);
		
	}

}


