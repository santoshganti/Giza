package edu.lab.algorthms.lang_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOverloadingMethods {

//	@Test(expected=ArithmeticException.class)
//	public void test() {
//		OverloadingMethods number = new OverloadingMethods();
//		assertEquals(0,number.divide(1,0),0.01);
//		assertEquals(0,number.divide(1.0, 0),0.01);
//		assertEquals(0,number.divide(1f, 0),0.01);
//		
//		
	@Test(expected = ArithmeticException.class)
	public void testIntDivideByZero() {
		OverloadingMethods number = new OverloadingMethods();
		assertEquals(0, number.divide(1, 0), 0.01);
	}

	@Test(expected = ArithmeticException.class)
	public void testFloatDivideByZero() {
		OverloadingMethods number = new OverloadingMethods();
		assertEquals(0, number.divide(1f, 0), 0.01);
	}

	@Test(expected = ArithmeticException.class)
	public void testDoubleDivideByZero() {
		OverloadingMethods number = new OverloadingMethods();
		assertEquals(0, number.divide(1f, 0), 0.01);
	}

	
}


