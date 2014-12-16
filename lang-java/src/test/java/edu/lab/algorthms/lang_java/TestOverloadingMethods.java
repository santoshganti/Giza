package edu.lab.algorthms.lang_java;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ocaguide.objective.inheritance.OverloadingMethods;

public class TestOverloadingMethods {

//	@Test(expected=ArithmeticException.class)
//	public void test() {
//		OverloadingMethods number = new OverloadingMethods();
//		assertEquals(0,number.divide(1,0),0.01);
//		assertEquals(0,number.divide(1.0, 0),0.01);
//		assertEquals(0,number.divide(1f, 0),0.01);
//		
//		
	@Test
	public void testIntDivideByZero() {
		OverloadingMethods number = new OverloadingMethods();
		assertEquals(0, number.divide(1, 0), 0.01);
	}

	@Test
	public void testFloatDivideByZero() {
		OverloadingMethods number = new OverloadingMethods();
		assertEquals(0, number.divide(1f, 0), 0.01);
	}

	@Test
	public void testDoubleDivideByZero() {
		OverloadingMethods number = new OverloadingMethods();
		assertEquals(0, number.divide(1f, 0), 0.01);
	}

	@Test
	public void testDoubleDivideByZero1() {
		OverloadingMethods number = new OverloadingMethods();
		assertEquals(0, number.divide(1f, 0), 0.01);
		
	}

}


